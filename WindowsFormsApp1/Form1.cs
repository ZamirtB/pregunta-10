using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form

    {
        private int z;
        private int result;
        private String text;

        public Form1()
        {
            InitializeComponent();
        }


        private void button10_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button11_Click(object sender, EventArgs e)
        {
            z = int.Parse(textEntrada.Text);
            for (int i = 0; i <= 9; i++)
            {
                result = z * i;
                text = text + result.ToString() + "  ";
                digitoResultado.Text = text;
            }
        }

        private void button12_Click(object sender, EventArgs e)
        {
            z = int.Parse(textEntrada.Text);
            for (int i = 1; i <= z; i++)
            {
                double b = Math.IEEERemainder(z, i);
                if (b == 0)
                {
                    text = text + i.ToString() + "  ";
                    digitoResultado.Text = text;
                }
            }
        }

        private void digitoRecibido_TextChanged(object sender, EventArgs e)
        {

        }

        private void digitoResultado_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void button13_Click(object sender, EventArgs e)
        {
            result = 1;
            z = int.Parse(textEntrada.Text);
            for (int i = 1; i <= z; i++)
            {
                result = result * i;
            }
            text = text + result.ToString();
            digitoResultado.Text = text;
        }

        private void button14_Click(object sender, EventArgs e)
        {
            result = 0;
            int b = 1;
            int z = 0;
            this.z = int.Parse(textEntrada.Text);
            text = text + b.ToString() + "  ";
            digitoResultado.Text = text;
            for (int i = 1; i < this.z; i++)
            {
                z = result;
                result = b;
                b = z + result;
                text = text + b.ToString() + "  ";
                digitoResultado.Text = text;
            }
        }
    }
}
