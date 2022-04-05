//nama paket
package wiwin203110043.daftarmahasiswa

//mengimport interface untuk kelas MainActivity2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

//membuat kelas MainActivity
class MainActivity : AppCompatActivity() {
    //method untuk mengatur tampilan halaman MainActivity2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //method untuk berpindah halaman
    fun simpan(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}