package mobile_computing.Main_Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Room_Selector : AppCompatActivity()
{
    var Room: String = "Funktioniert"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_selector)
    }








    fun Call_Way_Descriptor_Actibvty()
    {
        var New_Activity = Intent(this, Way_Descriptor::class.java)



        New_Activity.putExtra("Room_Name", Room)
    }
}