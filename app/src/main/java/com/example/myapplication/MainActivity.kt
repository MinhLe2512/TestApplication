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

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
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

        //getNetworkResource()
        /*//val listUnit2 = getUnit()
        val jsonString =
            baseContext.resources.openRawResource(R.raw.test)
        *//*val obj = JSONObject(jsonString)
        var objArray = obj.getJSONArray("Unit")

        for (i in 0..3) {
            val str = objArray.getJSONObject(i).toString()
            listUnit2[i].listOfProduct = getProduct(str)
        }*//*
        val isr = InputStreamReader(jsonString)
        val bufferedReader = BufferedReader(isr)
        val gSon = Gson()

        var listUnit3: List<Unit>
        listUnit3 = if (bufferedReader != null)
            gSon.fromJson(bufferedReader, object : TypeToken<List<Unit>>() {}.type)
        else
            listOf()



        val slider = ScreenSliderAdapter(this, listUnit3)
        view_unit.adapter = slider*/

        //val fw = FileWriter("test.json")
        /*val jsonString =
            baseContext.resources.openRawResource(R.raw.test).bufferedReader().use { it.readText() }

        val idList: ArrayList<String> = ArrayList()

        val obj = JSONObject(jsonString)
        var objArray = obj.getJSONArray("Unit")
        val i = objArray.length()
        for (o in i - 1 downTo 0) {
            textview1.text = objArray.getJSONObject(1).getString("id")
        }*/
    }

/*
    private fun getNetworkResource() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(SimpleAPI::class.java)
        val call = service.getPhotoAccount("users")
        call.enqueue(object : Callback<List<User>> {
            override fun onResponse(
                call: Call<List<User>>,
                response: Response<List<User>>
            ) {
                if (response.code() == 200) {
                    val listUser = response.body()
                    if (listUser.isNullOrEmpty())
                        return
                    val slider = ScreenSliderAdapter(this@MainActivity, listUser)
                    vp.adapter = slider

                    //checkSuccess(listUser)
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                txt1.text = t.message;
            }
        })
    }

    private fun checkSuccess(users: List<User>) {
        val slider = ScreenSliderAdapter(this, users)
        vp.adapter = slider
    }

    private fun getUnit(): List<Unit> {
        val jSonString =
            baseContext.resources.openRawResource(R.raw.test).bufferedReader().use { it.readText() }
        return Gson().fromJson(jSonString, object : TypeToken<List<Unit>>() {}.type)
    }

    private fun getProduct(string: String): List<Unit.Product> {
        return Gson().fromJson(string, object : TypeToken<List<Unit.Product>>() {}.type)
    }


    inner class ScreenSliderAdapter(
        private val context: Context,
        private val userList: List<User>
    ) :
        PagerAdapter() {
        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return `object` == view
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val view = View.inflate(context, R.layout.view_photo, null)
            //view.rc_unit.adapter =
            //SliderRecyclerAdapter(context, unitList[position].listOfProduct)

            //view.rc_unit.layoutManager = LinearLayoutManager(context)
            view.txt1.text = userList[position].login
            view.txt2.text = userList[position].id.toString()
            view.txt3.text = userList[position].node_id
            view.txt4.text = userList[position].avatar_url
            view.txt5.text = userList[position].gravatar_id
            view.txt6.text = userList[position].url
            view.txt7.text = userList[position].html_url
            view.txt8.text = userList[position].followers_url
            view.txt9.text = userList[position].following_url
            view.txt10.text = userList[position].gist_urls
            view.txt11.text = userList[position].starred_url
            view.txt12.text = userList[position].subscriptions_url
            view.txt13.text = userList[position].organizations_url
            view.txt14.text = userList[position].repos_url
            view.txt15.text = userList[position].events_url
            view.txt16.text = userList[position].received_events_url
            view.txt17.text = userList[position].type
            view.txt18.text = userList[position].site_admin.toString()

            container.addView(view)
            return view
        }


        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            val view = `object` as View
            container.removeView(view)
        }

        override fun getCount(): Int {
            return userList.size
        }

    }

    inner class SliderRecyclerAdapter(
        private val context: Context,
        private val productList: List<Unit.Product>
    ) : RecyclerView.Adapter<SliderRecyclerAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = View.inflate(context, R.layout.recycler_unit, null)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return productList.size
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val prodId: TextView = itemView.tv3
            val prodName: TextView = itemView.tv4
            val prodPrice: TextView = itemView.tv5
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.prodId.text = productList[position].id.toString()
            holder.prodName.text = productList[position].productName.toString()
            holder.prodPrice.text = productList[position].productPrice.toString()
        }

    }
*/
/*val listItem = TextList()
listItem.addText()

// The pager adapter, which provides the pages to the view pager widget.
var pagerAdapter = ScreenSlidePagerAdapter(this, listItem)
vp.adapter = pagerAdapter
vp.addOnPageChangeListener(viewPagerPageChangeListener)
//vp.pageMargin = 15
vp.setPadding(50, 0, 50, 0)
vp.clipToPadding = false

rec
}


*/
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
                // your logic here
                /*val sth = kingButtonAnimation()
                if (state == ViewPager.SCROLL_STATE_DRAGGING)
                    sth.start()*/
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                king_btn.rotation = positionOffset * 360f
                /*var string: String = "PositionOffset"
                var srh: String = "position"
                var sth2: String = "positionOffsetPixels"
                val sth = kingButtonAnimation()
                Log.d(string, positionOffset.toString())
                Log.d(srh, position.toString())
                Log.d(sth2, positionOffsetPixels.toString())
                if (positionOffset > 0.5) {
                    sth.start()
                }*/
            }

            override fun onPageSelected(position: Int) {
                // your logic here
            }
        }
}