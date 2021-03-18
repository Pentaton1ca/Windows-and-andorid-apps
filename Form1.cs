using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        int[] array = new int[8] { 50000, 30000, 250000, 500000, 70000, 20000, 150, 1000000 };
        int x = 0;
        int z = 0;
        int y = 0;
        int c = 0;
        int r = 0;
        int p = 0;
        int t = 0;
        int i = 0;


        private void button2_Click(object sender, EventArgs e)
        {
            CheckBox[] array2 = { CB1, CB2, CB3, CB4, CB5, CB6, CB7, CB8 };
            int ar2 = 0;
            int total_1 = 0;

            if (CB1.Checked)
            {
                x = array[0];
            }
            if (CB2.Checked)
            {
                z = array[1];
            }
            if (CB3.Checked)
            {
                y = array[2];
            }
            if (CB4.Checked)
            {
                c = array[3];
            }
            if (CB5.Checked)
            {
                r = array[4];
            }
            if (CB6.Checked)
            {
                p = array[5];
            }
            if (CB7.Checked)
            {
                t = array[6];
            }
            if (CB8.Checked)
            {
                i = array[7];
            }
            for (int q = 0; q < array2.Length; q++)
            {
                if (array2[q].Checked)
                    ar2++;
            }
            total_1 = x + z + y + c + p + t + i + r;
            label2.Text = label2.Text + Convert.ToString(ar2);
            label3.Text = label3.Text + total_1;
        }

        private void B1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Choose instruments you want to buy and start to make your dream coming true");
        }

        private void button1_Click(object sender, EventArgs e)
        {
             x = 0;
             z = 0;
             y = 0;
             c = 0;
             r = 0;
             p = 0;
             t = 0;
             i = 0;

            label2.Text = "INSTRUMENTS CHOSEN: ";
            label3.Text = "TOTAL PRICE(тг):";
        }
    }    
}
