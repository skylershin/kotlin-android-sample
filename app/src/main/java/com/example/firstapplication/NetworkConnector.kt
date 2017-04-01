package com.example.firstapplication

import android.os.AsyncTask
import android.net.ConnectivityManager
import android.net.NetworkInfo
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import java.net.HttpURLConnection.HTTP_OK
import javax.net.ssl.HttpsURLConnection


/**
 * Created by munkyushin on 4/1/17.
 */
class NetworkConnector {
    private class FetchTask() : AsyncTask<String, Void, FetchTask.Result>() {

        override fun onPostExecute(result: Result?) {

        }

        override fun onPreExecute() {

        }

        override fun doInBackground(vararg params: String?): Result {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        @Throws(IOException::class)
        private fun downloadURL(url: URL): String? {
            var stream: InputStream? = null
            var connection: HttpsURLConnection? = null
            var result: String? = null
            try {
                connection = url.openConnection() as HttpsURLConnection
                // Timeout for reading InputStream arbitrarily set to 3000ms.
                connection!!.setReadTimeout(3000)
                // Timeout for connection.connect() arbitrarily set to 3000ms.
                connection!!.setConnectTimeout(3000)
                // For this use case, set HTTP method to GET.
                connection!!.setRequestMethod("GET")
                // Already true by default but setting just in case; needs to be true since this request
                // is carrying an input (response) body.
                connection!!.setDoInput(true)
                // Open communications link (network traffic occurs here).
                connection!!.connect()
                val responseCode = connection!!.getResponseCode()
                if (responseCode != HttpsURLConnection.HTTP_OK) {
                    throw IOException("HTTP error code: " + responseCode)
                }
                // Retrieve the response body as an InputStream.
                stream = connection!!.getInputStream()
                if (stream != null) {
                    // Converts Stream to String with max length of 500.
                    result = readStream(stream, 500)
                }
            } finally {
                // Close Stream and disconnect HTTPS connection.
                if (stream != null) {
                    stream!!.close()
                }
                if (connection != null) {
                    connection!!.disconnect()
                }
            }
            return result
        }

        /**
         * Converts the contents of an InputStream to a String.
         */
        @Throws(IOException::class)
        private fun readStream(stream: InputStream, maxLength: Int): String? {
            var result: String? = null
            // Read InputStream using the UTF-8 charset.
            val reader = InputStreamReader(stream, "UTF-8")
            // Create temporary buffer to hold Stream data with specified max length.
            val buffer = CharArray(maxLength)
            // Populate temporary buffer with Stream data.
            var numChars = 0
            var readSize = 0
            while (numChars < maxLength && readSize != -1) {
                numChars += readSize
                val pct = 100 * numChars / maxLength
                readSize = reader.read(buffer, numChars, buffer.size - numChars)
            }
            if (numChars != -1) {
                // The stream was not empty.
                // Create String that is actual length of response body if actual length was less than
                // max length.
                numChars = Math.min(numChars, maxLength)
                result = String(buffer, 0, numChars)
            }
            return result
        }

        class Result {
            var mResultValue: String? = null
            var mException: Exception? = null

            constructor(resultValue: String) {
                mResultValue = resultValue
            }

            constructor(exception: Exception) {
                mException = exception
            }
        }
    }
}
