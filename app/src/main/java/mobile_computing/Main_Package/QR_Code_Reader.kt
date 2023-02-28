package mobile_computing.Main_Package




import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.zxing.integration.android.IntentIntegrator




private const val Camera_Request_Code = 101




class QR_Code_Reader : AppCompatActivity() {
    private lateinit var Code_Scanner: C




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_code_reader)




        /*val QR_Button: ImageButton = findViewById(R.id.Button_QR_Code_Reader)
        QR_Button.setOnClickListener({
            val intentIntegrator = IntentIntegrator(this)
            intentIntegrator.setDesiredBarcodeFormats(listOf(IntentIntegrator.QR_CODE))
            intentIntegrator.initiateScan()
        })*/




        fun QR_Reader() {
            Code_Scanner = CodeScanner(this, scanner_view_1)
        }


    }
}