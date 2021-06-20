package ordunio.maribel.cheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Productos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var coldDrinks = ArrayList<Product>()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        fun agregarProductos(){
            coldDrinks.add(Product("Caramel Frap", R.drawable.caramel-frap, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5))
            coldDrinks.add(Product("Chocolate Frap", R.drawable.chocolate-frap, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.",6))
            coldDrinks.add(Product("Cold Brew", R.drawable.coldbrew, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3))
            coldDrinks.add(Product("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4))
            coldDrinks.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7))
            coldDrinks.add(Product("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7))
        }

    }
}