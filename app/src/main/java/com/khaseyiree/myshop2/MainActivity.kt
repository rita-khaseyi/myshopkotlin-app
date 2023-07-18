package com.khaseyiree.myshop2
import ProductAdapter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.khaseyiree.myshop2.ApiClients
import com.khaseyiree.myshop2.ApiInterface
import com.khaseyiree.myshop2.ProductsResponse
import com.khaseyiree.myshop2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response


//import android.os.Bundle
//import android.telecom.Call
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.GridLayoutManager
//import com.khaseyiree.myshop2.ApiClients
//import com.khaseyiree.myshop2.ApiInterface
//import com.khaseyiree.myshop2.ProductsResponse
//import com.khaseyiree.myshop2.databinding.ActivityMainBinding
//import retrofit2.Response
//import javax.security.auth.callback.Callback
//

////////
////////import androidx.appcompat.app.AppCompatActivity
////////import android.os.Bundle
////////import android.widget.Toast
////////import retrofit2.Call
////////import retrofit2.Callback
////////import retrofit2.Response
////////
////////class MainActivity : AppCompatActivity() {
////////    override fun onCreate(savedInstanceState: Bundle?) {
////////        super.onCreate(savedInstanceState)
////////        setContentView(R.layout.activity_main)
////////    }
////////
////////    override fun onResume() {
////////        super.onResume()
////////        fetchProducts()
////////    }
////////
////////    fun fetchProducts(){
////////        var apiClient = ApiClients.buildClient(ApiInterface::class.java)
////////        var request = apiClient.getProducts()
////////        request.enqueue(object :Callback<ProductsResponse>{
////////            override fun onResponse(call:Call<ProductsResponse>,response: Response<ProductsResponse>){
////////                if (response.isSuccessful){
////////                    var products = response.body()?.products
////////                    Toast.makeText(baseContext,
////////                        "fetched ${products?.size} products",Toast.LENGTH_SHORT).show()
////////                }
////////                else {
////////                    Toast.makeText(baseContext, response.errorBody()?.string(), Toast.LENGTH_LONG).show()
////////                }
////////
////////            }
////////
////////            override fun onFailure(call:Call<ProductsResponse>, t:Throwable){
////////                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
////////            }
////////        })
////////    }
////////}
//////
//////import ProductAdapter
//////import androidx.appcompat.app.AppCompatActivity
//////import android.os.Bundle
//////import android.widget.Toast
//////import androidx.recyclerview.widget.LinearLayoutManager
//////import androidx.recyclerview.widget.RecyclerView
//////import com.khaseyiree.myshop2.ApiClients
//////import com.khaseyiree.myshop2.ApiInterface
//////import com.khaseyiree.myshop2.ProductsResponse
//////import com.khaseyiree.myshop2.R
//////import retrofit2.Call
//////import retrofit2.Callback
//////import retrofit2.Response
//////
//////class MainActivity : AppCompatActivity() {
//////
//////    private lateinit var productRecyclerView: RecyclerView
//////    private lateinit var productAdapter: ProductAdapter
//////
//////    override fun onCreate(savedInstanceState: Bundle?) {
//////        super.onCreate(savedInstanceState)
//////        setContentView(R.layout.activity_main)
//////
//////        productRecyclerView = findViewById(R.id.recyclerView)
//////        productAdapter = ProductAdapter(emptyList())
//////
//////        productRecyclerView.layoutManager = LinearLayoutManager(this)
//////        productRecyclerView.adapter = productAdapter
//////
//////        fetchProducts()
//////    }
//////
//////    private fun fetchProducts() {
//////        val apiClient = ApiClients.buildClient(ApiInterface::class.java)
//////        val request = apiClient.getProducts()
//////
//////        request.enqueue(object : Callback<ProductsResponse> {
//////            override fun onResponse(
//////                call: Call<ProductsResponse>,
//////                response: Response<ProductsResponse>
//////            ) {
//////                if (response.isSuccessful) {
//////                    val products = response.body()?.products
//////                    if (products != null) {
//////                        productAdapter = ProductAdapter(products)
//////                        productRecyclerView.adapter = productAdapter
//////                    }
//////                } else {
//////                    Toast.makeText(
//////                        baseContext,
//////                        response.errorBody()?.string(),
//////                        Toast.LENGTH_LONG
//////                    ).show()
//////                }
//////            }
//////
//////            override fun onFailure(call: Call<ProductsResponse>, t: Throwable) {
//////                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
//////            }
//////        })
//////    }
//////}
////
////package com.khaseyiree.myshop2
////
////import ProductAdapter
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////import android.widget.Toast
////import androidx.recyclerview.widget.LinearLayoutManager
////import androidx.recyclerview.widget.RecyclerView
////import com.khaseyiree.myshop2.ApiClients
////import com.khaseyiree.myshop2.ApiInterface
////import com.khaseyiree.myshop2.ProductsResponse
////import retrofit2.Call
////import retrofit2.Callback
////import retrofit2.Response
////
////class MainActivity : AppCompatActivity() {
////
////    private lateinit var productRecyclerView: RecyclerView
////    private lateinit var productAdapter: ProductAdapter
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
////
////        productRecyclerView = findViewById(R.id.recyclerView)
////        productAdapter = ProductAdapter(emptyList())
////
////        productRecyclerView.layoutManager = LinearLayoutManager(this)
////        productRecyclerView.adapter = productAdapter
////
////        fetchProducts()
////    }
////
////    private fun fetchProducts() {
////        val apiClient = ApiClients.buildClient(ApiInterface::class.java)
////        val request = apiClient.getProducts()
////
////        request.enqueue(object : Callback<ProductsResponse> {
////            override fun onResponse(
////                call: Call<ProductsResponse>,
////                response: Response<ProductsResponse>
////            ) {
////                if (response.isSuccessful) {
////                    val products = response.body()?.products
////                    val productAdapter=ProductsRvAdapter(products)
//////                    if (products != null) {
//////                        productAdapter = ProductAdapter(products)
//////                        productRecyclerView.adapter = productAdapter
//////                    }
////                } else {
////                    Toast.makeText(
////                        baseContext,
////                        response.errorBody()?.string(),
////                        Toast.LENGTH_LONG
////                    ).show()
////                }
////            }
////
////            override fun onFailure(call: Call<ProductsResponse>, t: Throwable) {
////                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
////            }
////        })
////    }
////}
////
//
//
//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//
//
//    override fun onResume() {
//        super.onResume()
//        fetchproduct()
//    }
//
//    fun fetchproduct(){
//        var apiClient = ApiClients.buildClient(ApiInterface::class.java)
//        var request = apiClient.getProducts()//function defined in the APi interface which is a specification
//        request.enqueue( object :retrofit2.Callback<ProductsResponse> {
//            //the anonymous callback
//            override fun onResponse(call: retrofit2.Call<ProductsResponse>, response: Response<ProductsResponse>) {
//                if (response.isSuccessful){
//                    var product = response.body()?.products
//                    var productAdapater=ProductAdapter(product?: emptyList())
////                    binding.rvProduct.layoutManager=LinearLayoutManager(this@MainActivity)
//                    binding.recyclerView.layoutManager= GridLayoutManager(this@MainActivity,2)
//                    binding.recyclerView.adapter=productAdapater
//                    Toast.makeText(baseContext,
//                        "fetched ${product?.size} product" ,Toast.LENGTH_LONG).show()
//
//                }
//                else{
//                    Toast.makeText(baseContext,response.errorBody()?.string(),Toast.LENGTH_LONG).show()
//                }
//            }
//
//            override fun onFailure(call: retrofit2.Call<ProductsResponse>, t: Throwable) {
//                Toast.makeText(baseContext,t.message,Toast.LENGTH_LONG).show()
//            }
//        })
//
//    }
//
//}
//
//
//
//
//
//
//
//
//

//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//    override fun onResume() {
//        super.onResume()
//        fetchProduct()
//    }
//    fun fetchProduct() {
//        var apiClient = ApiClients.buildClient(ApiInterface::class.java)
//        var request = apiClient.getProducts()//function defined in the APi interface which is a specification
//        request.enqueue(object :retrofit2.Callback<ProductsResponse>{
//            override fun onResponse(call:retrofit2.Callback<ProductsResponse>,response: Response<ProductsResponse>){
//                if (response.isSuccessful){
//                    var product = response.body()?.products
//                    var productAdapater=ProductAdapter(product?: emptyList())
//                    binding.recyclerView.layoutManager= LinearLayoutManager(this@MainActivity)
//                    binding.recyclerView.adapter=productAdapater
//                    Toast.makeText(baseContext,
//                        "fetched ${product?.size} product", Toast.LENGTH_LONG).show()
//
//            }
//        }
//    })
//}}

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fetchProduct()
    }

    fun fetchProduct() {
        val apiClient = ApiClients.buildClient(ApiInterface::class.java)
        val request = apiClient.getProducts()
        request.enqueue(object : retrofit2.Callback<ProductsResponse> {
            override fun onResponse(
                call: Call<ProductsResponse>,
                response: Response<ProductsResponse>
            ) {
                if (response.isSuccessful) {
                    val product = response.body()?.products
                    val productAdapter = ProductAdapter(product ?: emptyList())
                    binding.recyclerView.layoutManager = GridLayoutManager(this@MainActivity,2)
                    binding.recyclerView.adapter = productAdapter
                    Toast.makeText(
                        baseContext,
                        "Fetched ${product?.size} product(s)",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            override fun onFailure(call: Call<ProductsResponse>, t: Throwable) {
                // Handle failure case
            }
        })
    }
}

