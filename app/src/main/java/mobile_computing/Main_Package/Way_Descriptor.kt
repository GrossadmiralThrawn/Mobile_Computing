package mobile_computing.Main_Package




import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView


class Way_Descriptor : AppCompatActivity() {
    var Room: String = ""




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_way_descriptor)


        var Get_Datas:                Bundle?  = intent.extras
        var Descriptor_TextView:      TextView = findViewById(R.id.Descriptor_TextView)



        Room = Get_Datas!!.getString("Room_Name").toString()


        Descriptor_TextView.text = Room
    }
}