package ru.otus.rv.data

import ru.otus.rv.R

class ProductsRepository {

    fun getProducts(): List<Product> = AllProducts

    companion object {
        private val AllProducts: List<Product> = generateDummyProducts()
    }
}

private fun generateDummyProducts(): List<Product> {
    return listOf(
        Product(
            id = "0",
            resId = R.drawable.ic_0,
            title = "Rustic Chicken Sandwich",
            description = "A hearty sandwich with grilled chicken, fresh tomatoes, arugula, and a creamy sauce nestled between slices of toasted multi-grain bread.",
            foodType = FoodType.Food,
            price = 8.0,
        ),
        Product(
            id = "1",
            resId = R.drawable.ic_5,
            title = "Colorful Tofu Salad Bowl",
            description = "A vibrant and nutritious bowl filled with marinated tofu, fresh greens, cherry tomatoes, corn, cucumber, red cabbage, and a light dressing.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "2",
            resId = R.drawable.ic_4,
            title = "Creamy Beef Pasta",
            description = "Savory beef strips and mushrooms tossed with fettuccine in a rich, creamy sauce, garnished with fresh herbs and sun-dried tomatoes.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "3",
            resId = R.drawable.ic_3,
            title = "Double Stacked Burger",
            description = "A juicy double cheeseburger with lettuce, tomato, onion, pickles, and a special sauce, served on a shiny brioche bun.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "4",
            resId = R.drawable.ic_2,
            title = "Blossoming Tea",
            description = "An elegant clear mug showcasing a blooming tea flower, creating a visually stunning and delicate tea experience.",
            foodType = FoodType.Drinks,
            price = 4.0,
        ),

        Product(
            id = "5",
            resId = R.drawable.ic_1,
            title = "Shawarma Poutine",
            description = "A delicious twist on a Canadian classic, featuring crispy fries topped with flavorful shawarma meat, cheese curds, and a garnish of parsley.",
            foodType = FoodType.Food,
            price = 7.0,
        ),

        Product(
            id = "6",
            resId = R.drawable.ic_6,
            title = "Garden Fresh Salad",
            description = "A fresh mix of lettuce, chickpeas, avocados, tomatoes, roasted sweet potatoes, and radishes, topped with a light vinaigrette.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "7",
            resId = R.drawable.ic_7,
            title = "Raspberry Layer Cake",
            description = "Delicate layers of sponge cake filled with fresh raspberries and light cream frosting.",
            foodType = FoodType.Dessert,
            price = 6.0,
        ),

        Product(
            id = "8",
            resId = R.drawable.ic_8,
            title = "Pasta Primavera",
            description = "Twisted pasta with a colorful mix of fresh garden vegetables, tossed in a light and savory sauce.",
            foodType = FoodType.Food,
            price = 11.0,
        ),

        Product(
            id = "9",
            resId = R.drawable.ic_9,
            title = "Classic Grilled Cheese",
            description = "A comforting grilled cheese sandwich with a golden-brown crust, oozing with melted cheese.",
            foodType = FoodType.Food,
            price = 5.0,
        ),

        Product(
            id = "10",
            resId = R.drawable.ic_10,
            title = "Bolognese Pasta",
            description = "Hearty penne pasta coated in a rich and meaty bolognese sauce, sprinkled with Parmesan.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "11",
            resId = R.drawable.ic_11,
            title = "Green Goddess Bowl",
            description = "A nourishing bowl of quinoa and greens, adorned with nuts, fruits, and edible flowers, drizzled with a green herb dressing.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "12",
            resId = R.drawable.ic_12,
            title = "Seared Salmon Fillet",
            description = "Perfectly seared salmon served with a medley of diced vegetables, set in a savory broth.",
            foodType = FoodType.Food,
            price = 15.0,
        ),

        Product(
            id = "13",
            resId = R.drawable.ic_13,
            title = "Eggs Benedict Burger",
            description = "A unique take on a burger featuring a juicy patty topped with ham, a poached egg, and rich hollandaise sauce.",
            foodType = FoodType.Food,
            price = 13.0,
        ),

        Product(
            id = "14",
            resId = R.drawable.ic_14,
            title = "Barbecue Chicken Pizza",
            description = "A smoky barbecue pizza with tender chicken strips, onions, and a blend of cheeses on a crisp crust.",
            foodType = FoodType.Food,
            price = 14.0,
        ),

        Product(
            id = "15",
            resId = R.drawable.ic_15,
            title = "Stacked Pancakes",
            description = "A tall stack of fluffy pancakes served with butter and drizzled with golden maple syrup.",
            foodType = FoodType.Dessert,
            price = 7.0,
        ),

        Product(
            id = "16",
            resId = R.drawable.ic_16,
            title = "Savory Dumplings",
            description = "Steamed dumplings filled with tender seasoned meat, sprinkled with black sesame seeds.",
            foodType = FoodType.Food,
            price = 6.0,
        ),

        Product(
            id = "17",
            resId = R.drawable.ic_17,
            title = "Black Tea",
            description = "A classic cup of strong black tea, perfect for a morning start or an afternoon pick-me-up.",
            foodType = FoodType.Drinks,
            price = 2.0,
        ),

        Product(
            id = "18",
            resId = R.drawable.ic_18,
            title = "Citrus Cupcake",
            description = "A zesty lemon-flavored cupcake topped with a swirl of creamy frosting and a sprinkle of citrus zest.",
            foodType = FoodType.Dessert,
            price = 3.0,
        ),

        Product(
            id = "19",
            resId = R.drawable.ic_19,
            title = "Tomato Basil Pasta",
            description = "A simple yet delicious pasta dish with ripe cherry tomatoes, fresh basil, and a touch of garlic.",
            foodType = FoodType.Food,
            price = 8.0,
        ),

        Product(
            id = "20",
            resId = R.drawable.ic_20,
            title = "Vegetable Sushi Roll",
            description = "A healthy sushi roll filled with crisp vegetables and seasoned rice, wrapped in seaweed.",
            foodType = FoodType.Food,
            price = 7.0,
        ),

        Product(
            id = "21",
            resId = R.drawable.ic_21,
            title = "Herbal Tea",
            description = "A soothing blend of herbs and spices, steeped to perfection, to create a calming herbal tea.",
            foodType = FoodType.Drinks,
            price = 3.0,
        ),

        Product(
            id = "22",
            resId = R.drawable.ic_22,
            title = "Crispy Chicken Burger",
            description = "A crispy fried chicken breast with tangy coleslaw, served on a toasted sesame seed bun.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "23",
            resId = R.drawable.ic_23,
            title = "Nutty Mixed Salad",
            description = "A crunchy and satisfying salad with mixed greens, nuts, carrots, and a light vinaigrette.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "24",
            resId = R.drawable.ic_24,
            title = "Cheeseburger Deluxe",
            description = "A deluxe cheeseburger with a thick beef patty, melty cheese, fresh lettuce, tomatoes, and pickles.",
            foodType = FoodType.Food,
            price = 11.0,
        ),

        Product(
            id = "25",
            resId = R.drawable.ic_25,
            title = "BBQ Rib Burger",
            description = "A juicy burger topped with succulent BBQ ribs, crispy onions, and a creamy sauce.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "26",
            resId = R.drawable.ic_26,
            title = "Salmon Quinoa Bowl",
            description = "A healthy bowl of quinoa topped with a perfectly cooked salmon fillet, served with roasted vegetables.",
            foodType = FoodType.Food,
            price = 13.0,
        ),

        Product(
            id = "27",
            resId = R.drawable.ic_27,
            title = "Classic Bolognese",
            description = "A traditional Italian pasta dish with a rich bolognese meat sauce, topped with fresh herbs.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "28",
            resId = R.drawable.ic_28,
            title = "Oreo Chocolate Parfait",
            description = "A decadent layered dessert with crushed Oreos, chocolate pudding, and whipped cream.",
            foodType = FoodType.Dessert,
            price = 5.0,
        ),

        Product(
            id = "29",
            resId = R.drawable.ic_29,
            title = "Latte Art",
            description = "A smooth and creamy latte with expertly poured art, perfect for coffee lovers.",
            foodType = FoodType.Drinks,
            price = 4.0,
        ),

        Product(
            id = "30",
            resId = R.drawable.ic_30,
            title = "French Macarons",
            description = "An assortment of delicate French macarons in a variety of flavors and colors.",
            foodType = FoodType.Dessert,
            price = 6.0,
        ),

        Product(
            id = "31",
            resId = R.drawable.ic_31,
            title = "Tofu Avocado Salad",
            description = "A fresh and light salad with crispy tofu, creamy avocado, and mixed greens, tossed in a zesty dressing.",
            foodType = FoodType.Food,
            price = 11.0,
        ),

        Product(
            id = "32",
            resId = R.drawable.ic_32,
            title = "Berry Waffles",
            description = "Fluffy waffles topped with fresh berries and a drizzle of syrup, served with a side of ice cream.",
            foodType = FoodType.Dessert,
            price = 8.0,
        ),

        Product(
            id = "33",
            resId = R.drawable.ic_33,
            title = "Espresso Shot",
            description = "A strong and robust shot of espresso, the perfect kick-start to your day.",
            foodType = FoodType.Drinks,
            price = 3.0,
        ),

        Product(
            id = "34",
            resId = R.drawable.ic_34,
            title = "Creamy Tuscan Salmon",
            description = "Salmon fillet in a creamy Tuscan sauce with spinach and sun-dried tomatoes.",
            foodType = FoodType.Food,
            price = 14.0,
        ),

        Product(
            id = "35",
            resId = R.drawable.ic_35,
            title = "Avocado Sushi",
            description = "Sushi rolls filled with fresh avocado, succulent fish, and vibrant veggies, topped with a delicate slice of avocado.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "36",
            resId = R.drawable.ic_36,
            title = "Espresso Shot",
            description = "A rich and bold single shot of espresso, perfect to kick-start your day.",
            foodType = FoodType.Drinks,
            price = 2.0,
        ),

        Product(
            id = "37",
            resId = R.drawable.ic_45,
            title = "Sprinkled Donuts",
            description = "Sweet and fluffy donuts topped with colorful sprinkles and chocolate glaze.",
            foodType = FoodType.Dessert,
            price = 1.5,
        ),

        Product(
            id = "38",
            resId = R.drawable.ic_44,
            title = "Brownie Sundae",
            description = "Decadent chocolate brownie paired with vanilla ice cream and gooey caramel sauce.",
            foodType = FoodType.Dessert,
            price = 4.0,
        ),

        Product(
            id = "39",
            resId = R.drawable.ic_43,
            title = "Creamy Salmon",
            description = "Pan-seared salmon in a creamy sauce, served with a side of fresh greens.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "40",
            resId = R.drawable.ic_42,
            title = "Alfredo Pasta",
            description = "Fettuccine pasta smothered in a rich and creamy Alfredo sauce with parmesan.",
            foodType = FoodType.Food,
            price = 8.0,
        ),

        Product(
            id = "41",
            resId = R.drawable.ic_40,
            title = "Berry Crepes",
            description = "Thin crepes filled with mixed berries and topped with a dollop of whipped cream.",
            foodType = FoodType.Dessert,
            price = 5.0,
        ),

        Product(
            id = "42",
            resId = R.drawable.ic_41,
            title = "Classic French Toast",
            description = "Brioche French toast served with fresh blueberries, bananas, and maple syrup.",
            foodType = FoodType.Food,
            price = 6.0,
        ),

        Product(
            id = "43",
            resId = R.drawable.ic_39,
            title = "Avocado Toast",
            description = "Crunchy toast with ripe avocado spread and two perfectly cooked sunny-side-up eggs.",
            foodType = FoodType.Food,
            price = 7.0,
        ),

        Product(
            id = "44",
            resId = R.drawable.ic_38,
            title = "Poke Bowl",
            description = "A Hawaiian-inspired bowl with seasoned rice, fresh salmon, avocado, and vegetables.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "45",
            resId = R.drawable.ic_37,
            title = "Mint Tea",
            description = "A refreshing blend of mint tea leaves, served hot for a soothing experience.",
            foodType = FoodType.Drinks,
            price = 1.5,
        ),

        Product(
            id = "46",
            resId = R.drawable.ic_46,
            title = "Twirled Spaghetti",
            description = "A satisfying bowl of spaghetti, twirled high and coated in a rich, meaty tomato sauce.",
            foodType = FoodType.Food,
            price = 8.0,
        ),

        Product(
            id = "47",
            resId = R.drawable.ic_55,
            title = "Chocolate Fudge Cake",
            description = "Decadent chocolate fudge cake with layers of rich chocolate icing, perfect for any chocolate lover.",
            foodType = FoodType.Dessert,
            price = 5.0,
        ),

        Product(
            id = "48",
            resId = R.drawable.ic_54,
            title = "Berry Ice Pops",
            description = "Frozen berry ice pops made with real fruit and a hint of cream, a refreshing treat.",
            foodType = FoodType.Dessert,
            price = 3.0,
        ),

        Product(
            id = "49",
            resId = R.drawable.ic_49,
            title = "Surf 'n Turf Noodles",
            description = "A lavish dish with succulent shrimp, savory beef, and noodles, tossed with vegetables and a flavorful sauce.",
            foodType = FoodType.Food,
            price = 14.0,
        ),

        Product(
            id = "50",
            resId = R.drawable.ic_52,
            title = "Pappardelle Ragu",
            description = "Broad, flat pasta noodles, known as pappardelle, served with a hearty, slow-cooked meat ragu.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "51",
            resId = R.drawable.ic_51,
            title = "Creamy Pumpkin Soup",
            description = "A bowl of warm pumpkin soup with a dollop of cream, garnished with herbs and spices.",
            foodType = FoodType.Food,
            price = 7.0,
        ),

        Product(
            id = "52",
            resId = R.drawable.ic_50,
            title = "Aromatic Tea",
            description = "A cup of aromatic tea infused with a blend of herbs and spices, served hot.",
            foodType = FoodType.Drinks,
            price = 2.5,
        ),

        Product(
            id = "53",
            resId = R.drawable.ic_53,
            title = "Prawn Ramen",
            description = "Asian-style ramen noodles in broth, topped with juicy prawns, a soft-boiled egg, and fresh greens.",
            foodType = FoodType.Food,
            price = 11.0,
        ),

        Product(
            id = "54",
            resId = R.drawable.ic_48,
            title = "Salmon Avocado Sushi",
            description = "Fresh salmon and creamy avocado sushi rolls, garnished with roe for a burst of flavor.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "55",
            resId = R.drawable.ic_47,
            title = "Red Velvet Cupcake",
            description = "A classic red velvet cupcake with creamy frosting, a sweet treat that's as beautiful as it is delicious.",
            foodType = FoodType.Dessert,
            price = 4.0,
        ),
        Product(
            id = "56",
            resId = R.drawable.ic_56,
            title = "Aromatic Black Tea",
            description = "A cup of finely brewed black tea with hints of floral notes, perfect for a relaxing break.",
            foodType = FoodType.Drinks,
            price = 2.5,
        ),

        Product(
            id = "57",
            resId = R.drawable.ic_65,
            title = "Loaded Hot Dog",
            description = "A classic hot dog topped with a tangy mustard, relish, and freshly chopped green onions, nestled in a soft bun.",
            foodType = FoodType.Food,
            price = 4.0,
        ),

        Product(
            id = "58",
            resId = R.drawable.ic_64,
            title = "Sweet Baklava",
            description = "Layers of flaky pastry, filled with nuts and sweetened with honey syrup, a rich and traditional dessert.",
            foodType = FoodType.Dessert,
            price = 3.5,
        ),

        Product(
            id = "59",
            resId = R.drawable.ic_63,
            title = "Craft Cocktail",
            description = "An expertly mixed cocktail with a blend of premium spirits and fresh garnishes, a true artisanal creation.",
            foodType = FoodType.Drinks,
            price = 7.0,
        ),

        Product(
            id = "60",
            resId = R.drawable.ic_62,
            title = "Truffle Mushroom Pizza",
            description = "A delicious pizza topped with aromatic truffles and earthy mushrooms, a gourmet delight.",
            foodType = FoodType.Food,
            price = 11.0,
        ),

        Product(
            id = "61",
            resId = R.drawable.ic_61,
            title = "Caramel Cheesecake",
            description = "A smooth cheesecake drizzled with rich caramel and chocolate shavings, a decadent treat.",
            foodType = FoodType.Dessert,
            price = 5.0,
        ),

        Product(
            id = "62",
            resId = R.drawable.ic_60,
            title = "Creamy Layer Cake",
            description = "A multi-layered cake with light, airy cream and hints of dried fruit, perfect for a celebration.",
            foodType = FoodType.Dessert,
            price = 4.5,
        ),

        Product(
            id = "63",
            resId = R.drawable.ic_59,
            title = "Spicy Chicken Pizza",
            description = "A spicy pizza with tender chicken pieces, hot sauce, and melted cheese, for those who like it hot.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "64",
            resId = R.drawable.ic_58,
            title = "Crunchy Sushi Roll",
            description = "Sushi rolls with a crispy exterior, filled with fresh ingredients and drizzled with a creamy sauce.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "65",
            resId = R.drawable.ic_57,
            title = "Salmon Sushi Plate",
            description = "A plate of succulent salmon sushi, garnished with a touch of green and served with soy sauce for dipping.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "66",
            resId = R.drawable.ic_66,
            title = "Minty Cocktail",
            description = "A refreshing cocktail with a mint garnish, perfect for a sophisticated evening.",
            foodType = FoodType.Drinks,
            price = 8.0,
        ),

        Product(
            id = "67",
            resId = R.drawable.ic_75,
            title = "Pink Refreshment",
            description = "A light and invigorating drink with a vibrant pink hue, served chilled.",
            foodType = FoodType.Drinks,
            price = 7.0,
        ),

        Product(
            id = "68",
            resId = R.drawable.ic_74,
            title = "Watermelon Slush",
            description = "A sweet and icy watermelon slush, a perfect treat to beat the heat.",
            foodType = FoodType.Drinks,
            price = 5.0,
        ),

        Product(
            id = "69",
            resId = R.drawable.ic_73,
            title = "Strawberry Cocktail",
            description = "A fruity cocktail with fresh strawberry flavors, garnished with a strawberry slice.",
            foodType = FoodType.Drinks,
            price = 8.0,
        ),

        Product(
            id = "70",
            resId = R.drawable.ic_72,
            title = "Loaded Supreme Pizza",
            description = "A supreme pizza loaded with a variety of toppings for a hearty meal.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "71",
            resId = R.drawable.ic_71,
            title = "Classic Pepperoni Pizza",
            description = "A classic pepperoni pizza with a crispy crust and gooey cheese.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "72",
            resId = R.drawable.ic_70,
            title = "Nachos Grande",
            description = "A mountain of nachos topped with jalapeños, guacamole, salsa, and melted cheese.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "73",
            resId = R.drawable.ic_69,
            title = "Date Maamoul",
            description = "Traditional maamoul cookies filled with sweet dates, dusted with powdered sugar.",
            foodType = FoodType.Dessert,
            price = 4.0,
        ),

        Product(
            id = "74",
            resId = R.drawable.ic_68,
            title = "Classic Hot Dog",
            description = "A traditional hot dog with ketchup, mustard, and relish on a soft bun.",
            foodType = FoodType.Food,
            price = 6.0,
        ),

        Product(
            id = "75",
            resId = R.drawable.ic_67,
            title = "Deluxe Chili Dog",
            description = "A hot dog smothered in chili, topped with cheese and onions for an extra kick.",
            foodType = FoodType.Food,
            price = 7.0,
        ),
        Product(
            id = "76",
            resId = R.drawable.ic_76,
            title = "Gourmet Bratwurst",
            description = "Grilled bratwurst with a savory mix of toppings wrapped in a freshly baked bun.",
            foodType = FoodType.Food,
            price = 6.0,
        ),

        Product(
            id = "77",
            resId = R.drawable.ic_77,
            title = "Classic Hot Dog",
            description = "A traditional hot dog served with a line of mustard and ketchup, simple and beloved.",
            foodType = FoodType.Food,
            price = 5.0,
        ),

        Product(
            id = "78",
            resId = R.drawable.ic_78,
            title = "Nutty Cupcake",
            description = "A chocolate cupcake topped with a rich nutty frosting and a piece of chocolate hazelnut confection.",
            foodType = FoodType.Dessert,
            price = 3.5,
        ),

        Product(
            id = "79",
            resId = R.drawable.ic_79,
            title = "Bitter-Sweet Cocktail",
            description = "A refined cocktail with a balance of bitter and sweet, garnished with a citrus twist.",
            foodType = FoodType.Drinks,
            price = 8.0,
        ),

        Product(
            id = "80",
            resId = R.drawable.ic_80,
            title = "Arugula Prosciutto Pizza",
            description = "A thin-crust pizza topped with fresh arugula, prosciutto, and a drizzle of olive oil.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "81",
            resId = R.drawable.ic_81,
            title = "Citrus Summer Drink",
            description = "A refreshing summer drink infused with citrus flavors and served chilled.",
            foodType = FoodType.Drinks,
            price = 7.0,
        ),

        Product(
            id = "82",
            resId = R.drawable.ic_82,
            title = "Mojito Classic",
            description = "A classic mojito cocktail with mint leaves, lime, and a splash of soda.",
            foodType = FoodType.Drinks,
            price = 7.5,
        ),

        Product(
            id = "83",
            resId = R.drawable.ic_83,
            title = "Orange Bliss",
            description = "A vibrant and sweet cocktail with a creamy top and a slice of orange.",
            foodType = FoodType.Drinks,
            price = 8.0,
        ),

        Product(
            id = "84",
            resId = R.drawable.ic_84,
            title = "Pepperoni Feast Pizza",
            description = "Classic pepperoni pizza with a generous helping of cheese and spicy pepperoni.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "85",
            resId = R.drawable.ic_85,
            title = "Mini Pepperoni Pizza",
            description = "A personal-sized pizza with mini pepperoni, perfect for a quick snack or meal.",
            foodType = FoodType.Food,
            price = 6.0,
        ),

        Product(
            id = "86",
            resId = R.drawable.ic_86,
            title = "Chive Hot Dog",
            description = "A classic hot dog topped with fresh chives, ketchup, and mustard.",
            foodType = FoodType.Food,
            price = 4.0,
        ),

        Product(
            id = "87",
            resId = R.drawable.ic_87,
            title = "Blueberry Cheesecake",
            description = "Creamy cheesecake topped with a generous layer of blueberries.",
            foodType = FoodType.Dessert,
            price = 5.0,
        ),

        Product(
            id = "88",
            resId = R.drawable.ic_88,
            title = "Gourmet Sausage Sandwich",
            description = "Artisanal sausage on a toasted bun with gourmet toppings.",
            foodType = FoodType.Food,
            price = 7.0,
        ),

        Product(
            id = "89",
            resId = R.drawable.ic_90,
            title = "Berry Cocktail",
            description = "A sweet berry-infused cocktail garnished with fresh berries.",
            foodType = FoodType.Drinks,
            price = 8.0,
        ),

        Product(
            id = "90",
            resId = R.drawable.ic_91,
            title = "Rosemary Gin Fizz",
            description = "Aromatic gin cocktail with a hint of rosemary and lime.",
            foodType = FoodType.Drinks,
            price = 9.0,
        ),

        Product(
            id = "91",
            resId = R.drawable.ic_92,
            title = "Mango Smoothie",
            description = "A tropical mango smoothie, creamy and sweet.",
            foodType = FoodType.Drinks,
            price = 6.0,
        ),

        Product(
            id = "92",
            resId = R.drawable.ic_93,
            title = "Spinach & Feta Pizza",
            description = "Fresh spinach and feta cheese pizza, light and flavorful.",
            foodType = FoodType.Food,
            price = 11.0,
        ),

        Product(
            id = "93",
            resId = R.drawable.ic_95,
            title = "Supreme Veggie Pizza",
            description = "Loaded veggie pizza with a variety of fresh toppings.",
            foodType = FoodType.Food,
            price = 12.0,
        ),

        Product(
            id = "94",
            resId = R.drawable.ic_96,
            title = "Bruschetta Chicken Pizza",
            description = "Grilled chicken and bruschetta on a crispy crust.",
            foodType = FoodType.Food,
            price = 13.0,
        ),
        Product(
            id = "97",
            resId = R.drawable.ic_97,
            title = "Classic Pepperoni Pizza",
            description = "A traditional hand-tossed pizza topped with pepperoni and mozzarella cheese.",
            foodType = FoodType.Food,
            price = 8.0,
        ),

        Product(
            id = "98",
            resId = R.drawable.ic_98,
            title = "Nutty Chocolate Square",
            description = "Rich, decadent chocolate squares sprinkled with assorted nuts for a crunchy finish.",
            foodType = FoodType.Dessert,
            price = 4.0,
        ),

        Product(
            id = "99",
            resId = R.drawable.ic_100,
            title = "Spinach Feta Pizza",
            description = "A delightful pizza with a garlic base, topped with spinach, feta, and a touch of mozzarella.",
            foodType = FoodType.Food,
            price = 9.0,
        ),

        Product(
            id = "100",
            resId = R.drawable.ic_101,
            title = "Loaded Veggie Pizza",
            description = "A veggie lover's dream pizza packed with fresh peppers, olives, mushrooms, and onions.",
            foodType = FoodType.Food,
            price = 10.0,
        ),

        Product(
            id = "101",
            resId = R.drawable.ic_102,
            title = "Turkish Baklava",
            description = "Sweet Mediterranean dessert made of layers of filo, chopped nuts, and honey syrup.",
            foodType = FoodType.Dessert,
            price = 5.0,
        ),

        Product(
            id = "102",
            resId = R.drawable.ic_103,
            title = "Pepperoni Basil Pizza",
            description = "Hot and fresh pizza with pepperoni, basil, and a generous helping of cheese.",
            foodType = FoodType.Food,
            price = 8.0,
        ),

        Product(
            id = "103",
            resId = R.drawable.ic_104,
            title = "Berry Martini",
            description = "A refreshing cocktail with a mix of berry flavors, served chilled with a mint garnish.",
            foodType = FoodType.Drinks,
            price = 7.0,
        ),

        Product(
            id = "104",
            resId = R.drawable.ic_105,
            title = "Rosy Cocktail",
            description = "An elegant drink with floral notes and a hint of citrus, perfect for a summer day.",
            foodType = FoodType.Drinks,
            price = 6.0,
        ),

        Product(
            id = "106",
            resId = R.drawable.ic_106,
            title = "Tropical Smoothie",
            description = "A refreshing blend of tropical fruits, served cold with a pineapple garnish.",
            foodType = FoodType.Drinks,
            price = 5.5,
        ),

        Product(
            id = "107",
            resId = R.drawable.ic_107,
            title = "Velvety Cheesecake",
            description = "Smooth and creamy cheesecake with a tangy raspberry topping and a chocolate biscuit base.",
            foodType = FoodType.Dessert,
            price = 6.0,
        ),
    )
}
