package kc.ac.kpu.watchforuser

import android.app.Notification
import android.app.NotificationManager

    import android.os.Bundle
    import android.view.Menu
    import android.view.MenuItem
    import android.widget.Button
    import androidx.appcompat.app.AppCompatActivity

    class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean { // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_hand_held, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { // Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }
}
