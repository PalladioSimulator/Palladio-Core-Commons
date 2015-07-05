package org.palladiosimulator.commons.eclipseutils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;

/**
 * Helper class for coping with files, especially residing within plug-ins.
 * 
 * @author Sebastian Lehrig
 */
public final class FileHelper {

    /** Static helper classes shall not be instantiated. */
    private FileHelper() {
    }

    /**
     * Gets a file object of the given path represented as String. Works even if the files comes
     * from a plug-in packed in a jar file.
     * 
     * @see http://stackoverflow.com/questions/23825933/eclipse-plugin-development-how-to-get-
     *      resource-from-another-plugin
     * @param path
     *            The path to load. Can use URIs starting with "platform:/", e.g., pointing to files
     *            within plug-ins ("platform:/plugin").
     * @return The file object to be returned.
     */
    public static File getFile(final String path) {
        try {
            final URL resolveURL = FileLocator.toFileURL(new URL(path));
            final URI resolvedURI = new URI(resolveURL.getProtocol(), resolveURL.getPath(), null);
            return new File(resolvedURI);
        } catch (final MalformedURLException e1) {
            throw new IllegalArgumentException("The path \"" + path + "\" is not a valid URL!");
        } catch (final IOException e) {
            throw new RuntimeException("Unable to load \"" + path + "\"!");
        } catch (final URISyntaxException e) {
            throw new IllegalArgumentException("The path \"" + path + "\" is not a valid URI!");
        }
    }

    /**
     * Gets all files from a given folder, filtered by the given file extension.
     * 
     * @param folder
     *            File object pointing to the folder to load.
     * @param fileExtension
     *            Filter for files; only files with the given extension are returned.
     * @return Array of files within the given folder and with the given file extension.
     */
    public static File[] getFiles(final File folder, final String fileExtension) {
        if (folder == null || !folder.exists() || !folder.isDirectory()) {
            throw new IllegalArgumentException("The folder \"" + folder + "\" is not accessible!");
        }

        return folder.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(final File directory, final String fileName) {
                return fileName.endsWith(fileExtension);
            }

        });
    }

    /**
     * Gets all files from a given folder, filtered by the given file extension.
     * 
     * @param folder
     *            String-representation pointing to the folder to load.
     * @param fileExtension
     *            Filter for files; only files with the given extension are returned.
     * @return Array of files within the given folder and with the given file extension.
     */
    public static File[] getFiles(final String path, final String fileExtension) {
        return getFiles(getFile(path), fileExtension);
    }

    /**
     * Gets all URIs to files of a given folder, filtered by the given file extension.
     * 
     * @param folder
     *            String-representation pointing to the folder to load.
     * @param fileExtension
     *            Filter for files; only files with the given extension are returned.
     * @return Array of files within the given folder and with the given file extension.
     */
    public static org.eclipse.emf.common.util.URI[] getURIs(final String path, final String fileExtension) {
        final File[] files = FileHelper.getFiles(path, fileExtension);
        final org.eclipse.emf.common.util.URI[] uris = new org.eclipse.emf.common.util.URI[files.length];

        for (int i = 0; i < files.length; ++i) {
            uris[i] = org.eclipse.emf.common.util.URI.createFileURI(files[i].getPath());
        }

        return uris;
    }
}