package mobile_computing.Main_Package




import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class Select_Language_Activitiy : AppCompatActivity()
{
    lateinit var Deutsch_Checkbox:        CheckBox
    lateinit var English_Checkbox:        CheckBox
    lateinit var Franzoesisch_Checkbox:   CheckBox
    lateinit var Select_Language_Button:  Button
    lateinit var Place:                   Locale
             var Settings_Setter:         Configuration = Configuration()


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language_activitiy)



        Deutsch_Checkbox      = findViewById(R.id.checkBox_Deutsch)
        English_Checkbox      = findViewById(R.id.checkBox_Englisch)
        Franzoesisch_Checkbox = findViewById(R.id.checkBox_Franzoesisch)


        Select_Language_Button = findViewById(R.id.Select_Language_Button)
        Select_Language_Button.setOnClickListener(View.OnClickListener()
        {
            val Language_Key:      String                                                   = "Language Key"
            val Primary_Settings                                                            = getSharedPreferences("My_Primary_Preferences", 0)
            val Edit_Language:                    SharedPreferences.Editor                  = Primary_Settings.edit()
            val To_Many_Arguments: TextView = findViewById(R.id.textView_To_Many_Arguments)



            if (Deutsch_Checkbox.isChecked &&(English_Checkbox.isChecked || Franzoesisch_Checkbox.isChecked))
            {
                To_Many_Arguments.visibility = View.VISIBLE
            }
            else
            {
                if ((English_Checkbox.isChecked && (Deutsch_Checkbox.isChecked || Franzoesisch_Checkbox.isChecked)) || (Franzoesisch_Checkbox.isChecked && (Deutsch_Checkbox.isChecked || English_Checkbox.isChecked)))
                {
                    To_Many_Arguments.visibility = View.VISIBLE
                }
                else
                {
                    if (Deutsch_Checkbox.isChecked)
                    {
                        Edit_Language.putString(Language_Key, "De")
                        Edit_Language.commit()



                        Place = Locale("De", "De")


                        Settings_Setter.setLocale(Place)


                        baseContext.getResources().updateConfiguration(Settings_Setter, baseContext.getResources().displayMetrics)
                    }
                    else
                    {
                        if (English_Checkbox.isChecked)
                        {
                            Edit_Language.putString(Language_Key, "En")
                            Edit_Language.commit()


                            Place = Locale("En", "En")


                            Settings_Setter.setLocale(Place)
                        }
                        else
                        {
                            if (Franzoesisch_Checkbox.isChecked)
                            {
                                Edit_Language.putString(Language_Key, "Fr")
                                Edit_Language.commit()


                                Place = Locale("Fr", "Fr")


                                Settings_Setter.setLocale(Place)
                            }
                            else
                            {
                                To_Many_Arguments.text = "Please select a language"
                            }
                        }
                    }
                }
            }
        })
    }

}