package net.uniquecomputer.calculatorpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // finding all ids
        var one = findViewById<Button>(R.id.one)
        var two = findViewById<Button>(R.id.two)
        var three = findViewById<Button>(R.id.three)
        var four = findViewById<Button>(R.id.four)
        var five = findViewById<Button>(R.id.five)
        var six = findViewById<Button>(R.id.six)
        var seven = findViewById<Button>(R.id.seven)
        var eight = findViewById<Button>(R.id.eight)
        var nine = findViewById<Button>(R.id.nine)
        var zero = findViewById<Button>(R.id.zero)
        var plus = findViewById<Button>(R.id.plus)
        var minus = findViewById<Button>(R.id.minus)
        var multiply = findViewById<Button>(R.id.multiply)
        var divide = findViewById<Button>(R.id.divide)
        var equal = findViewById<Button>(R.id.equals)
        var clear = findViewById<Button>(R.id.clear)
        var ac = findViewById<Button>(R.id.ac)
        var dot = findViewById<Button>(R.id.dot)
        var startBracket  = findViewById<Button>(R.id.start_bracket)
        var endBracket = findViewById<Button>(R.id.end_bracket)

        var inputText = findViewById<TextView>(R.id.inputText)
        var total = findViewById<TextView>(R.id.total)

        ac.setOnClickListener{
            inputText.text = ""
            total.text = ""
        }

        zero.setOnClickListener{
//            inputText.text = "0" -> replace kar dega
            inputText.append("0")   // -> append hai o next text me add hoga
        }

        one.setOnClickListener{
            inputText.append("1")
        }

        two.setOnClickListener{
            inputText.append("2")
        }

        three.setOnClickListener{
            inputText.append("3")
        }

        four.setOnClickListener{
            inputText.append("4")
        }

        five.setOnClickListener{
            inputText.append("5")
        }

        six.setOnClickListener{
            inputText.append("6")
        }

        seven.setOnClickListener{
            inputText.append("7")
        }

        eight.setOnClickListener{
            inputText.append("8")
        }

        nine.setOnClickListener{
            inputText.append("9")
        }

        plus.setOnClickListener{
            inputText.append("+")
        }

        minus.setOnClickListener{
            inputText.append("-")
        }

        multiply.setOnClickListener{
            inputText.append("*")
        }

        divide.setOnClickListener{
            inputText.append("/")
        }

        dot.setOnClickListener{
            inputText.append(".")
        }

        startBracket.setOnClickListener{
            inputText.append("(")
        }

        endBracket.setOnClickListener{
            inputText.append(")")
        }

        //clear the one text
        clear.setOnClickListener{
            // find the length of inputText
            var clearTxt = inputText.length()
            if (clearTxt > 0)
                inputText.text = inputText.text.substring(0 , clearTxt -1)
        }


        // Equal Program
        equal.setOnClickListener{
            var expression = ExpressionBuilder(inputText.text.toString()).build()
            val result = expression.evaluate()
            var longResult = result.toLong()

            if (result == longResult.toDouble()){

                total.text = longResult.toString()

            }else{
                total.text = result.toString()
            }

        }



    }
}