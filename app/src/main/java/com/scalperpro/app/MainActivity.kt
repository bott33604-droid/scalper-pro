
package com.scalperpro.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scherm = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 32, 24, 24)
            setBackgroundColor(Color.rgb(13, 19, 32))
        }

        fun tekst(waarde: String, grootte: Float, kleur: Int) {
            scherm.addView(TextView(this).apply {
                text = waarde
                textSize = grootte
                setTextColor(kleur)
                setPadding(0, 12, 0, 12)
            })
        }

        tekst("SCALPER PRO", 28f, Color.WHITE)
        tekst("AI CRYPTO TRADING", 13f, Color.LTGRAY)
        tekst("● DEMO DASHBOARD", 16f, Color.GREEN)

        tekst("MARKTOVERZICHT", 18f, Color.WHITE)
        tekst("BTC / USDT       Wachten op live data", 16f, Color.WHITE)
        tekst("ETH / USDT       Wachten op live data", 16f, Color.WHITE)
        tekst("SOL / USDT       Wachten op live data", 16f, Color.WHITE)

        tekst("HANDELSSTRATEGIE", 18f, Color.WHITE)
        tekst("AI-signaal: Nog niet actief", 16f, Color.YELLOW)
        tekst("Positie: Geen", 16f, Color.WHITE)
        tekst("Leverage: Maximaal 2x", 16f, Color.WHITE)

        tekst("RISICOBEHEER", 18f, Color.WHITE)
        tekst("Startkapitaal: €100", 16f, Color.WHITE)
        tekst("Risico per trade: €0,50", 16f, Color.WHITE)
        tekst("Dagelijkse verlieslimiet: €2", 16f, Color.WHITE)

        tekst("Veilig testen – geen echte orders", 13f, Color.LTGRAY)

        setContentView(scherm)
    }
}
