import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khaseyiree.myshop2.Product
import com.khaseyiree.myshop2.databinding.ProductItemListBinding
import com.squareup.picasso.Picasso

class ProductAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =
            ProductItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        val binding = holder.binding
        binding.apply {
            productImageView.tag = product.thumbnail
            productIdTextView.text = product.id.toString()
            productDescriptionTextView.text = product.description
            productPriceTextView.text = product.price.toString()
            productRatingTextView.text = product.rating.toString()
            productStockTextView.text = product.stock
            productBrandTextView.text = product.brand

            Picasso.get()
                .load(product.thumbnail)
                .resize(400, 400)
                .centerCrop()
                .into(binding.productImageView)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ProductViewHolder(val binding: ProductItemListBinding) :
        RecyclerView.ViewHolder(binding.root)
}
