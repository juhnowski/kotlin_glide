package com.juhnowski.ilya.imgviewer

import android.content.Context
import android.graphics.Bitmap
import android.os.AsyncTask
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.security.NetworkSecurityPolicy
import android.support.annotation.RequiresApi
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {

        val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun load(view: View){

        val imageView = findViewById<ImageView>(R.id.my_image_view)

        Glide.with(this)
            .load("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAATcAAACiCAMAAAATIHpEAAAAclBMVEX///9otEVms0Jjsj1fsTh1ulafzozC37ddsDTZ69KYyYRbrzL8/vxari74/PaDwGnp9OR9vWDx+O5wuFCs1JyIwnDU6MxWrSeiz5G22Kmw1qHN5MSTx33K48Btt0t3ulni8Nvs9ei83LBNqhSp0piOxXdbgDzvAAADVElEQVR4nO3da3OiMBiGYUzSikLAUhVFrdbq//+Ly0lRqy68u1PocF/TD21oZ8IzORCE1HEAAAAAAAAAAAAAAAAAAAAAAP/LavX88OaH6vHLBF/x7snhSfwV/VRVfpdQb58cfdPhj9Xkd/m07rD4LhgND+Pj7DiebnblwY1nJ21VrOsORvuOE+1D4xqttVJaG0+vs2HPV2bRdvW6S5vF5OgZNbikXbVMIzV+27XrrpXRrh58o0z6xWz62PBOaCXDZPrQ2nsY22DgzduuXleFJh/Oboa3vChrh/Gw7Qp2U5h3Ur2fz256q0nm4yxSu2+7il20zltbPvy/X7U4naRFs6zIPl+I9dK+GNu87OJ2fNXgTDawJXmR+9l2Nbsm8qrGFVz3Uz1Oj2/zJqieLcR66XjKyqyTj5uJwcySbXnYLNuuaLfsbNW89Lf5VFVFXtB2VTtl/fiC95o+tF3VLgnimrGlcyrL1MrQ1M7NcPVbqd1N07GOu5eV+rGlHZWZ4SSyqj7W92lgRdvZfbzU916sUv2otxPE1Nh4OxL9aXS01q772WNnbjbMx2m3m49fG0hXYlF+Y0mrPga3KpYIapBehlhdn9me51/dx49qXstJ1O6aXL4Va/ty2aVU2yfRgtPNInfUMLcXx3fL703bJ9ECcpMhNxlykyE3GXKTITcZcW7v5EZuzZGbDLnJiHP7IDdya47cZMhNRpzbgNzIrTn6qQztTUaa24DcyE2A3GTEuSlyI7fmyE2G3GTEuWlyI7fmyE3mX3I7/X4fc0vKk7dR49zKt7X6+Wx54OYnb8aNXl8oGtmmeOYw7uUj0iNjtLYzR5CbM421NranL7kF+8UhbzHNc3MmyWLZ+5dRBbnBITcpcpNpmFtvX5S51Sw3l9xK9FOZif17Wmfqre3qdkfY4AVUNl+pBKpucMq+tl3ZLvEXrk2dt7vIfypdFsYvbAN3IwgC563MyN0FZ354LvT7+N5kHafcvMstQMN7hbhEbjLkJkNuMuQmQ24y5CZDbjLkJkNuMuQmc4rIXn7EN7tXiEvT4nZStvdPpXwgopeb09QUeHnbsld7MZYPRFg2aHxsolxj4qRGIa6tlsPv/2nhbiEAAAAAAAAAAAAAAAAAAAAA4B/8AeMWMnCUj6kNAAAAAElFTkSuQmCC")
            .into(imageView)
        Log.d(TAG, "done")
    }

}