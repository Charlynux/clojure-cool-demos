(def poney {
    :name "Twilight Starla Sparkle"
    :image "images/twilight.jpg"
    :meta {
        :prices {
            :price 3300
            :premium-price 3900
        }
    }
})

(update-in poney [:meta :prices :price] inc)