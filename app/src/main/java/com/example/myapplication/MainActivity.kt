package com.example.myapplication


import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.model.TextList
import kotlinx.android.synthetic.main.page_fragments.view.*
import kotlinx.android.synthetic.main.view_unit.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_unit)

        val tl = TextList()
        tl.addText()

        val slider = ScreenSlidePagerAdapter(this, tl)
        view_unit.adapter = slider

        view_unit.setPadding(80, 0, 80, 0)
        view_unit.clipToPadding = false

        view_unit.addOnPageChangeListener(viewPagerPageChangeListener)
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private inner class ScreenSlidePagerAdapter(
        private val context: Context,
        private val item_list: TextList
    ) : PagerAdapter() {
        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val view = View.inflate(context, R.layout.page_fragments, null)
            view.txtView3.text = item_list.getList(position)
            container.addView(view)
            return view
        }

        override fun isViewFromObject(view: View, obj: Any): Boolean {
            return view == obj
        }

        override fun getCount(): Int {
            return item_list.getSize()
        }

        override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
            val view = obj as View
            container.removeView(view)
        }
    }

    //Create Animator Value
    /*private fun kingButtonAnimation(): ValueAnimator {
        val animatorValue = ValueAnimator.ofFloat(0f, 360f)
        animatorValue.addUpdateListener {
            val value = it.animatedValue as Float
            king_btn.rotation = value
        }
        animatorValue.interpolator = LinearInterpolator()
        //animatorValue.duration = 1000
        return animatorValue
    }*/

    private var viewPagerPageChangeListener: ViewPager.OnPageChangeListener =
        object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                king_btn.rotation = positionOffset * 360f
            }

            override fun onPageSelected(position: Int) {
            }
        }
}