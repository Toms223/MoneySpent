package Requests

import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

fun get(url: String): String{
        val url = URL(url)
        val connection = url.openConnection()
        val buffer = StringBuffer()
        BufferedReader(InputStreamReader(connection.getInputStream())).use {
            buffer.append(it.readLine())
        }
        return buffer.toString()
    }

fun toJsonObject(input: String): JsonObject{
        val parser = JsonParser.parseString(input)
        return parser.asJsonObject
    }
