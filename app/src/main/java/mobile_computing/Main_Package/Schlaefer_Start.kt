package mobile_computing.Main_Package

class Schlaefer_Start (private val Time_To_Sleep: Long)
{
    val New_Sleeper: Sleeper_Class = Sleeper_Class(Time_To_Sleep)


    fun Start()
    {
        New_Sleeper.start()
    }
}