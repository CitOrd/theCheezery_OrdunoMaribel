package ordunio.maribel.cheezery

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class Productos : AppCompatActivity() {
    var listaProductos = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        var opcion = 0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var listview: ListView = findViewById(R.id.list_productos) as ListView
        var adaptador = AdaptadorProducto(this, listaProductos)

        listview.adapter= adaptador

        val bundle= intent.extras

        if(bundle != null){
            val type = bundle.getString("type")

            when(type){
                "coldDrinks"->{
                      cargarProductos(1)
                }
                "hotDrinks" ->{
                    cargarProductos(2)
                }
                "sweets"->{
                    cargarProductos(3)
                }
                "salties" ->{
                    cargarProductos(4)
                }
            }
        }

        cargarProductos(opcion)
        }


        fun cargarProductos(opcion: Int){

            when(opcion){
                1 ->{
                    listaProductos.clear()
                    listaProductos.add(Product("Caramel Frap", R.drawable.caramelfrap, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5))
                    listaProductos.add(Product("Chocolate Frap", R.drawable.chocolatefrap, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.",6))
                    listaProductos.add(Product("Cold Brew", R.drawable.coldbrew, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3))
                    listaProductos.add(Product("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4))
                    listaProductos.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7))
                    listaProductos.add(Product("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7))
                }
                2 ->{
                    listaProductos.clear()
                    listaProductos.add(Product("Americano", R.drawable.americano,"Cafe Americano", 5))
                    listaProductos.add(Product("Latte", R.drawable.latte,"Latte", 7))
                    listaProductos.add(Product("Espresso", R.drawable.espresso,"Espresso", 4))
                    listaProductos.add(Product("HotChocolate", R.drawable.hotchocolate,"Choco Caliente", 5))
                }
                3 ->{
                    listaProductos.clear()
                    listaProductos.add(Product("BlueBerryCake",R.drawable.blueberrycake, "Cake sabor a BlueBerry", 13))
                    listaProductos.add(Product("RedvelvetCake",R.drawable.redvelvetcake, "Cake sabor a RedVelvet", 6))
                    listaProductos.add(Product("StrawBerryCheeseCake",R.drawable.strawberrycheesecake, "StrawBerryCheesseCake", 7))
                    listaProductos.add(Product("Tiramisu",R.drawable.tiramisu, "Tiramisu", 4))
                }
                4 ->{
                    listaProductos.clear()
                    listaProductos.add(Product("ChickenCrepes",R.drawable.chickencrepes, "ChickenCrepes", 3))
                    listaProductos.add(Product("Hampaini",R.drawable.hampanini, "Hampaini", 4))
                    listaProductos.add(Product("Nachos",R.drawable.nachos, "Nachos", 7))
                    listaProductos.add(Product("PhillyCheesesteak",R.drawable.phillycheesesteak, "PhillyCheesesteak", 6))
                }


            }

        }


        class AdaptadorProducto: BaseAdapter {
            var contexto: Context?= null
            var productos = ArrayList<Product>()


            constructor(contexto: Context, productos: ArrayList<Product>){
                this.contexto =contexto
                this.productos = productos
            }

            override fun getCount(): Int {
                return productos.size
            }

            override fun getItem(position: Int): Any {
                return productos[position]
            }

            override fun getItemId(position: Int): Long {
                return 1
            }

            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                var prod = productos[position]
                var inflator = LayoutInflater.from(contexto)
                var vista = inflator.inflate(R.layout.producto, null)

                var imagen = vista.findViewById(R.id.product_image) as ImageView
                var nombre = vista.findViewById(R.id.product_name) as TextView
                var desc = vista.findViewById(R.id.product_description) as TextView
                var precio = vista.findViewById(R.id.product_price) as TextView

                imagen.setImageResource(prod.image)
                nombre.setText(prod.name)
                desc.setText(prod.desc)
                precio.setText("$${prod.price}")


                return vista
            }
        }
}