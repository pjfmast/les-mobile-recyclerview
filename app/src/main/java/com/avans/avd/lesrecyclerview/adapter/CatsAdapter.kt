package com.avans.avd.lesrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.avans.avd.lesrecyclerview.model.CatUiModel
import com.avans.avd.lesrecyclerview.R
import com.avans.avd.lesrecyclerview.model.CatBreed
import com.avans.avd.lesrecyclerview.model.Gender
import com.avans.avd.lesrecyclerview.uitl.ImageLoader

private val FEMALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9793;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}
private val MALE_SYMBOL by lazy {
    HtmlCompat.fromHtml("&#9794;", HtmlCompat.FROM_HTML_MODE_LEGACY)
}
private const val UNKNOWN_SYMBOL = "?"

class CatsAdapter(
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader
) : RecyclerView.Adapter<CatsAdapter.CatViewHolder>() {
    private val catsData = mutableListOf<CatUiModel>()
    fun setData(catsData: List<CatUiModel>) {
        this.catsData.clear()
        this.catsData.addAll(catsData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = layoutInflater.inflate(R.layout.item_cat, parent, false)
        return CatViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bindData(catsData[position])
    }

     override fun getItemCount(): Int = catsData.size


    inner class CatViewHolder(
        containerView: View,
    ) : RecyclerView.ViewHolder(containerView) {
        val catBiographyView: TextView =  containerView.findViewById(R.id.item_cat_biography)
        val catBreedView: TextView =  containerView.findViewById(R.id.item_cat_breed)
        val catGenderView: TextView = containerView.findViewById(R.id.item_cat_gender)
        val catNameView: TextView = containerView.findViewById(R.id.item_cat_name)
        val catPhotoView: ImageView = containerView.findViewById(R.id.item_cat_photo)

        fun bindData(catData: CatUiModel) {
            imageLoader.loadImage(catData.imageUrl, catPhotoView)
            catNameView.text = catData.name
            catBreedView.text = when (catData.breed) {
                CatBreed.AmericanCurl -> "American Curl"
                CatBreed.BalineseJavanese -> "Balinese-Javanese"
                CatBreed.ExoticShorthair -> "Exotic Shorthair"
            }
            catBiographyView.text = catData.biography
            catGenderView.text = when (catData.gender) {
                Gender.Female -> FEMALE_SYMBOL
                Gender.Male -> MALE_SYMBOL
                else -> UNKNOWN_SYMBOL
            }
        }
    }
}