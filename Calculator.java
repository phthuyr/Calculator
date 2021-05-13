package Swing;


    import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class Calculator extends JFrame {

        private JButton add,factorial, onedividedbyx,pi,cos,tan,sin,one,two,three,four,five,six,seven,eight,nine,
                squared,subtract,squareroot,multiply,divide,openbracket,closebracket,zero,ln,decpoint,equals,clear,reset,log;
        private JTextField display1, display2;
        // display1: màn hình in kết quả
        // display2: màn hình hiện phép tính

        public Calculator() {
            frameDesign();
        }

        private void frameDesign() {
            display2 = new javax.swing.JTextField();
            display1 = new javax.swing.JTextField();
            onedividedbyx = new javax.swing.JButton();
            factorial = new javax.swing.JButton();
            pi = new javax.swing.JButton();
            cos = new javax.swing.JButton();
            tan = new javax.swing.JButton();
            sin = new javax.swing.JButton();
            seven = new javax.swing.JButton();
            eight = new javax.swing.JButton();
            nine = new javax.swing.JButton();
            add = new javax.swing.JButton();
            squared = new javax.swing.JButton();
            subtract = new javax.swing.JButton();
            squareroot = new javax.swing.JButton();
            multiply = new javax.swing.JButton();
            openbracket = new javax.swing.JButton();
            divide = new javax.swing.JButton();
            closebracket = new javax.swing.JButton();
            four = new javax.swing.JButton();
            five = new javax.swing.JButton();
            six = new javax.swing.JButton();
            one = new javax.swing.JButton();
            two = new javax.swing.JButton();
            three = new javax.swing.JButton();
            ln = new javax.swing.JButton();
            decpoint = new javax.swing.JButton();
            zero = new javax.swing.JButton();
            equals = new javax.swing.JButton();
            clear = new javax.swing.JButton();
            reset = new javax.swing.JButton();
            log = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Scientific Calculator");
            setResizable(false);

            display2.setBackground(new java.awt.Color(199, 218, 220));
            display2.setFont(new java.awt.Font("Tahoma", 1, 20));
            display2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            display2.setFocusable(false);

            display1.setBackground(new java.awt.Color(199, 218, 220));
            display1.setFont(new java.awt.Font("Tahoma", 1, 20));
            display1.setAutoscrolls(false);
            display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            display1.setFocusable(false);

            onedividedbyx.setFont(new java.awt.Font("Tahoma", 1, 15));
            onedividedbyx.setText("1/x");
            onedividedbyx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            onedividedbyx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            onedividedbyx.setFocusable(false);
            onedividedbyx.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+ "^" + " (-1)");
                }
            });

            factorial.setFont(new java.awt.Font("Tahoma", 1, 15));
            factorial.setText("!");
            factorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            factorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            factorial.setFocusable(false);
            factorial.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    int value = Integer.parseInt(display2.getText());
                    int fact = factorial(value);
                    display1.setText(String.valueOf(fact));
                    display2.setText(value + "!");
                }
                int factorial(int n){
                    return (n==1 || n==0) ? 1 : n*factorial(n-1);
                }
            });

            ln.setFont(new java.awt.Font("Tahoma", 1, 15));
            ln.setText("ln");
            ln.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ln.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ln.setFocusable(false);
            ln.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"ln");
                }
            });

            cos.setFont(new java.awt.Font("Tahoma", 1, 15));
            cos.setText("Cos");
            cos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            cos.setFocusable(false);
            cos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"cos");
                }
            });

            tan.setFont(new java.awt.Font("Tahoma", 1, 15));
            tan.setText("Tan");
            tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            tan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            tan.setFocusable(false);
            tan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"tan");
                }
            });

            sin.setFont(new java.awt.Font("Tahoma", 1, 15));
            sin.setText("Sin");
            sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            sin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            sin.setFocusable(false);
            sin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"sin");
                }
            });

            seven.setFont(new java.awt.Font("Tahoma", 1, 15));
            seven.setText("7");
            seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            seven.setFocusable(false);
            seven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"7");
                }
            });

            eight.setFont(new java.awt.Font("Tahoma", 1, 15));
            eight.setText("8");
            eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            eight.setFocusable(false);
            eight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"8");
                }
            });

            nine.setFont(new java.awt.Font("Tahoma", 1, 15));
            nine.setText("9");
            nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            nine.setFocusable(false);
            nine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"9");
                }
            });

            add.setFont(new java.awt.Font("Tahoma", 1, 15));
            add.setText("+");
            add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            add.setFocusable(false);
            add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"+");
                }
            });

            squared.setFont(new java.awt.Font("Tahoma", 1, 15));
            squared.setText("x²");
            squared.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            squared.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            squared.setFocusable(false);
            squared.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    double d = Double.parseDouble(display2.getText());
                    double square = d*d;
                    display1.setText(String.valueOf(square));
                    display2.setText(d+"²");
                }
            });

            subtract.setFont(new java.awt.Font("Tahoma", 1, 15));
            subtract.setText("-");
            subtract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            subtract.setFocusable(false);
            subtract.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"-");
                }
            });

            squareroot.setFont(new java.awt.Font("Tahoma", 1, 15));
            squareroot.setText("√x");
            squareroot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            squareroot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            squareroot.setFocusable(false);
            squareroot.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    String value = display2.getText();
                    double result = Math.sqrt(Double.parseDouble(value));
                    display1.setText(String.valueOf(result));
                    display2.setText("√"+ display2.getText());
                }
            });

            multiply.setFont(new java.awt.Font("Tahoma", 1, 15));
            multiply.setText("*");
            multiply.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            multiply.setFocusable(false);
            multiply.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"*");
                }
            });

            openbracket.setFont(new java.awt.Font("Tahoma", 1, 15));
            openbracket.setText("(");
            openbracket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            openbracket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            openbracket.setFocusable(false);
            openbracket.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"(");
                }
            });

            divide.setFont(new java.awt.Font("Tahoma", 1, 15));
            divide.setText("/");
            divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            divide.setFocusable(false);
            divide.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"/");
                }
            });

            closebracket.setFont(new java.awt.Font("Tahoma", 1, 15));
            closebracket.setText(")");
            closebracket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            closebracket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            closebracket.setFocusable(false);
            closebracket.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+")");
                }
            });

            four.setFont(new java.awt.Font("Tahoma", 1, 15));
            four.setText("4");
            four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            four.setFocusable(false);
            four.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"4");
                }
            });

            five.setFont(new java.awt.Font("Tahoma", 1, 15));
            five.setText("5");
            five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            five.setFocusable(false);
            five.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"5");
                }
            });

            six.setFont(new java.awt.Font("Tahoma", 1, 15));
            six.setText("6");
            six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            six.setFocusable(false);
            six.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"6");
                }
            });

            one.setFont(new java.awt.Font("Tahoma", 1, 15));
            one.setText("1");
            one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            one.setFocusable(false);
            one.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+ "1");
                }
            });

            two.setFont(new java.awt.Font("Tahoma", 1, 15));
            two.setText("2");
            two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            two.setFocusable(false);
            two.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"2");
                }
            });

            three.setFont(new java.awt.Font("Tahoma", 1, 15));
            three.setText("3");
            three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            three.setFocusable(false);
            three.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"3");
                }
            });

            pi.setFont(new java.awt.Font("Tahoma", 1, 15));
            pi.setText("ⁿ");
            pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            pi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            pi.setFocusable(false);
            pi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"pi");
                    display1.setText(display1.getText()+"3.141592654");
                }
            });

            decpoint.setFont(new java.awt.Font("Tahoma", 1, 15));
            decpoint.setText(".");
            decpoint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            decpoint.setFocusable(false);
            decpoint.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+".");
                }
            });

            zero.setFont(new java.awt.Font("Tahoma", 1, 15));
            zero.setText("0");
            zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            zero.setFocusable(false);
            zero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText(display2.getText()+"0");
                }
            });

            equals.setFont(new java.awt.Font("Tahoma", 1, 15));
            equals.setText("=");
            equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            equals.setFocusable(false);
            equals.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    String value = display2.getText();
                    double result = Operation.eval(value);
                    display1.setText(String.valueOf(result));
                    display2.setText(value);
                }
            });

            clear.setFont(new java.awt.Font("Tahoma", 1, 15));
            clear.setText("C");
            clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            clear.setFocusable(false);
            clear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    String value = display2.getText();
                    value = value.substring(0,value.length()-1);
                    display2.setText(value);
                }
            });

            reset.setFont(new java.awt.Font("Tahoma", 1, 15));
            reset.setText("AC");
            reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            reset.setFocusable(false);
            reset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    display2.setText("");
                    display1.setText("");
                }
            });

            log.setFont(new java.awt.Font("Tahoma", 1, 15));
            log.setText("log");
            log.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            log.setFocusable(false);
            log.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    display2.setText(display2.getText()+"log");
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(onedividedbyx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(display2)
                                            .addComponent(display1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)

                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(openbracket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(closebracket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(56, 56, 56))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(sin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                    .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                    .addComponent(ln, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                    .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(openbracket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(closebracket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(onedividedbyx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
            );

            pack();
        }
    }




