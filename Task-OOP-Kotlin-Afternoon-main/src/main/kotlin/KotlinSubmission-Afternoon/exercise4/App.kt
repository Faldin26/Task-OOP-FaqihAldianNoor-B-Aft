package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    println("Berapa Umurmu:")

    try {
        val userInput = readLine()
        val umur = userInput?.toInt()
        if (umur != null) {
            println("Umur kamu ialah: $umur tahun")
        } else {
            println("Invalid input: Please enter a valid number.")
        }
    } catch (e: NumberFormatException) {
        println("Invalid input: Please enter a valid number.")
    } finally {
        println("Semoga Panjang Umur.")
    }
}


