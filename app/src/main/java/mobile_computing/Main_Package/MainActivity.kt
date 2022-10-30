package mobile_computing.Main_Package

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Select_Language                            = Intent(this, Select_Language_Activitiy::class.java)
        val Primary_Settings                           = getSharedPreferences("My_Primary_Preferences", 0)
        var Edit_Language:    SharedPreferences.Editor = Primary_Settings.edit()
        val Language_Key                               = "Language Key"
        var Settings_Setter:  Configuration            = Configuration()





        if ((Primary_Settings.getString(Language_Key, "") == null) || (Primary_Settings.getString(Language_Key, "") == ""))
        {
            val Test_TextView: TextView = findViewById(R.id.TextView_MainActivity)
            var Sleeper_1: Sleeper_Class = Sleeper_Class(1000)



            Test_TextView.text = "Welcome"


            Sleeper_1.start()



            startActivity(Select_Language)
        }
        else
        {
            val Language:      String = Primary_Settings.getString(Language_Key, "Fehler")!!
            var Place:         Locale = Locale(Language)
            var config:        Configuration = Configuration()
            val Test_TextView: TextView = findViewById(R.id.TextView_MainActivity)



            Locale.setDefault(Place)


            Settings_Setter.setLocale(Place)


            config.locale = Place



            baseContext.getResources().updateConfiguration(Settings_Setter, baseContext.getResources().displayMetrics)



            Test_TextView.text
        }
    }
}