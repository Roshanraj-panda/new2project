package com.hbc


object encryptanddecrypt {
  def main(args: Array[String]) = {

    def encode(message: String): String =
      java.util.Base64.getEncoder().encodeToString(message.map(_.toBinaryString).mkString(" ").map(_.toByte).toArray)

    def decode(base64: String): String =
      new String(java.util.Base64.getDecoder.decode(base64)).split(" ").map(b => Integer.parseInt(b, 2).toChar).mkString

    val str = "xxx"


  }
}