package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val myProfile = setProfile("Raden Ayu", "Alfirah Aliyah", 20, true)

    println(myProfile)
}

fun setProfile(firstName: String, lastName: String, age: Int, single: Boolean): String{
    return "Nama depan: $firstName\nNama belakang: $lastName\nUmur: $age\nStatus: ${if(single) "single" else "tidak single"}\n"

}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Massive Challenge Group Mobile")
    println("Group ID: $groupId")
    println("Anggota group: $groupMember")
    println("Sesi Kelas: $session")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    var teamMember = listOf("Alfirah","Cindy","Hana","Aldio","Cakra","Choirul Huda")
    var myMentor= listOf("Mentor 1: Kak 1","Mentor 2: Kak 2","Mentor 3: Kak 3")
    return teamMember+myMentor
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak 1", "Kak 2", "Kak 3")
    val countOfGroup = arrayOf<String>("Alfirah","Cindy","Hana","Aldio","Cakra","Choirul Huda")

    val total= mentor.size+countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember\n")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Zero Waste Hero", listOf("Aldio","Cakra","Choirul Huda","Alfirah","Cindy","Hana")
        , "Afernoon")

}