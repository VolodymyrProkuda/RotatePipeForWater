package com.rpfw.rotatepipeforwater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rpfw.rotatepipeforwater.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val imagesOfPipeWithWater = listOf<Int>(R.drawable.blue_pipe_down_left, R.drawable.blue_pipe_down_right,R.drawable.blue_pipe_up_right, R.drawable.blue_pipe_up_left,
    R.drawable.blue_pipe_right_left,R.drawable.blue_pipe_up_down,R.drawable.blue_pipe_right_left,R.drawable.blue_pipe_up_down,
    R.drawable.blue_pipe_start,R.drawable.blue_pipe_end)
    val fieldOfPipeWithWater = mutableListOf<Int>(
    0,4,4,0,
    4,0,4,0,
    4,0,4,0,
    0,0,0,0,
    8,0,0,9)
    val fieldOfPipeWithWaterBase = mutableListOf<Int>(
        0,4,4,0,
        4,0,4,0,
        4,0,4,0,
        0,0,0,0,
        8,0,0,9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        reDrawAllImg()
        binding.imageView.setOnClickListener { reCalculateField(0); reDrawAllImg() }
        binding.imageView2.setOnClickListener { reCalculateField(1); reDrawAllImg() }
        binding.imageView3.setOnClickListener { reCalculateField(2); reDrawAllImg() }
        binding.imageView4.setOnClickListener { reCalculateField(3); reDrawAllImg() }
        binding.imageView5.setOnClickListener { reCalculateField(4); reDrawAllImg() }
        binding.imageView6.setOnClickListener { reCalculateField(5); reDrawAllImg() }
        binding.imageView7.setOnClickListener { reCalculateField(6); reDrawAllImg() }
        binding.imageView8.setOnClickListener { reCalculateField(7); reDrawAllImg() }
        binding.imageView9.setOnClickListener { reCalculateField(8); reDrawAllImg() }
        binding.imageView10.setOnClickListener { reCalculateField(9); reDrawAllImg() }
        binding.imageView11.setOnClickListener { reCalculateField(10); reDrawAllImg() }
        binding.imageView12.setOnClickListener { reCalculateField(11); reDrawAllImg() }
        binding.imageView13.setOnClickListener { reCalculateField(12); reDrawAllImg() }
        binding.imageView14.setOnClickListener { reCalculateField(13); reDrawAllImg() }
        binding.imageView15.setOnClickListener { reCalculateField(14); reDrawAllImg() }
        binding.imageView16.setOnClickListener { reCalculateField(15); reDrawAllImg() }

        binding.imageView18.setOnClickListener { reCalculateField(17); reDrawAllImg() }
        binding.imageView19.setOnClickListener { reCalculateField(18); reDrawAllImg() }


    }
    fun reCalculateField(n:Int){
        fieldOfPipeWithWater[n]++
        if ((fieldOfPipeWithWater[n]==4) || (fieldOfPipeWithWater[n]==8)) fieldOfPipeWithWater[n] = fieldOfPipeWithWaterBase[n]
    }



    fun reDrawAllImg()
    {
        binding.imageView.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[0]])
        binding.imageView2.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[1]])
        binding.imageView3.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[2]])
        binding.imageView4.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[3]])
        binding.imageView5.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[4]])
        binding.imageView6.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[5]])
        binding.imageView7.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[6]])
        binding.imageView8.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[7]])
        binding.imageView9.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[8]])
        binding.imageView10.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[9]])
        binding.imageView11.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[10]])
        binding.imageView12.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[11]])
        binding.imageView13.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[12]])
        binding.imageView14.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[13]])
        binding.imageView15.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[14]])
        binding.imageView16.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[15]])
        binding.imageView17.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[16]])
        binding.imageView18.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[17]])
        binding.imageView19.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[18]])
        binding.imageView20.setImageResource(imagesOfPipeWithWater[fieldOfPipeWithWater[19]])
    }

}