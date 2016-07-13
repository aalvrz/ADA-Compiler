package compilador;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class Interfaz extends javax.swing.JFrame {


    private final String proyectDirectory = "C:\\Users\\Jaime Andres\\Documents\\UNITEC\\Compiladores I\\Proyecto";
    private File archivoAbierto;

    /** Creates new form Interfaz */
    public Interfaz()
    {
        initComponents();

        TextLineNumber tln = new TextLineNumber(this.inputArea);
        tln.setUpdateFont(true);
        this.jScrollPane3.setRowHeaderView(tln);

        archivoAbierto = null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        abrirArchivo = new javax.swing.JButton();
        guardarArchivo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        compilarCodigo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        compilarCup = new javax.swing.JButton();
        compilarJFLEX = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        limpiarOutput = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextPane();
        lineaLabel = new javax.swing.JLabel();
        colLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Ada");
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        abrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/imgs/folder_32.png"))); // NOI18N
        abrirArchivo.setToolTipText("Open File");
        abrirArchivo.setContentAreaFilled(false);
        abrirArchivo.setFocusPainted(false);
        abrirArchivo.setMaximumSize(new java.awt.Dimension(42, 42));
        abrirArchivo.setMinimumSize(new java.awt.Dimension(42, 42));
        abrirArchivo.setPreferredSize(new java.awt.Dimension(42, 42));
        abrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArchivoActionPerformed(evt);
            }
        });
        jToolBar1.add(abrirArchivo);

        guardarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/imgs/save_32.png"))); // NOI18N
        guardarArchivo.setToolTipText("Save/Save As...");
        guardarArchivo.setContentAreaFilled(false);
        guardarArchivo.setFocusPainted(false);
        guardarArchivo.setFocusable(false);
        guardarArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardarArchivo.setMaximumSize(new java.awt.Dimension(42, 42));
        guardarArchivo.setMinimumSize(new java.awt.Dimension(42, 42));
        guardarArchivo.setPreferredSize(new java.awt.Dimension(42, 42));
        guardarArchivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoActionPerformed(evt);
            }
        });
        jToolBar1.add(guardarArchivo);
        jToolBar1.add(jSeparator3);

        compilarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/imgs/compile.png"))); // NOI18N
        compilarCodigo.setToolTipText("Compile");
        compilarCodigo.setContentAreaFilled(false);
        compilarCodigo.setFocusPainted(false);
        compilarCodigo.setFocusable(false);
        compilarCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compilarCodigo.setMaximumSize(new java.awt.Dimension(42, 42));
        compilarCodigo.setMinimumSize(new java.awt.Dimension(42, 42));
        compilarCodigo.setPreferredSize(new java.awt.Dimension(42, 42));
        compilarCodigo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compilarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarCodigoActionPerformed(evt);
            }
        });
        jToolBar1.add(compilarCodigo);
        jToolBar1.add(jSeparator1);

        compilarCup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/imgs/cup_icon.png"))); // NOI18N
        compilarCup.setToolTipText("Compile JavaCUP File");
        compilarCup.setFocusable(false);
        compilarCup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compilarCup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compilarCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarCupActionPerformed(evt);
            }
        });
        jToolBar1.add(compilarCup);

        compilarJFLEX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/imgs/page_table_32.png"))); // NOI18N
        compilarJFLEX.setToolTipText("Compile JFlex File");
        compilarJFLEX.setFocusable(false);
        compilarJFLEX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compilarJFLEX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compilarJFLEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarJFLEXActionPerformed(evt);
            }
        });
        jToolBar1.add(compilarJFLEX);
        jToolBar1.add(jSeparator2);

        limpiarOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/imgs/window_app_blank_32.png"))); // NOI18N
        limpiarOutput.setToolTipText("Clear Output");
        limpiarOutput.setFocusable(false);
        limpiarOutput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiarOutput.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiarOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarOutputActionPerformed(evt);
            }
        });
        jToolBar1.add(limpiarOutput);

        outputArea.setColumns(20);
        outputArea.setEditable(false);
        outputArea.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        outputArea.setRows(5);
        outputArea.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jScrollPane2.setViewportView(outputArea);

        inputArea.setBackground(new java.awt.Color(46, 51, 54));
        inputArea.setBorder(null);
        inputArea.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        inputArea.setForeground(new java.awt.Color(255, 255, 255));
        inputArea.setCaretColor(new java.awt.Color(255, 255, 255));
        inputArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                inputAreaCaretUpdate(evt);
            }
        });
        jScrollPane3.setViewportView(inputArea);

        lineaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lineaLabel.setText("Linea: ");

        colLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        colLabel.setText("Columna:");

        jMenu1.setText("Archivo");
        menuBar.add(jMenu1);

        jMenu2.setText("Compilacion");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(808, Short.MAX_VALUE)
                .addComponent(lineaLabel)
                .addGap(48, 48, 48)
                .addComponent(colLabel)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lineaLabel)
                    .addComponent(colLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivoActionPerformed

        // Crear File Chooser
        JFileChooser fc = new JFileChooser(proyectDirectory);
        
        int seleccion = fc.showOpenDialog(null);

        if ( seleccion == fc.APPROVE_OPTION )
        {
            // Escoger el archivo
            archivoAbierto = fc.getSelectedFile();
            
            // Agregarlo al textarea
            try
            {
                FileReader fr = new FileReader(archivoAbierto);
                BufferedReader reader = new BufferedReader(fr);
                
                String linea;
                String input = "";
                while ( (linea = reader.readLine()) != null )
                    input += linea + "\n";

                inputArea.setText(input);
                fr.close();
                reader.close();
                outputArea.append("Archivo abierto: " + archivoAbierto.getName() + "\n");
            }
            catch (Exception e )
            {
                outputArea.setText(e.getMessage());
            }
        }

    }//GEN-LAST:event_abrirArchivoActionPerformed

    private void compilarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarCodigoActionPerformed

        outputArea.setText(""); // Clear
        outputArea.append("Realizando Analisis Lexico y Sintactico... \n\n");

        // Llamar el parser que intente parsear el codigo mostrado en
        // el textarea
        try
        {
            parser p = new parser(new Lexer(new java.io.FileInputStream(archivoAbierto.getAbsolutePath())));
            p.parse();
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_compilarCodigoActionPerformed

    private void compilarCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarCupActionPerformed

        String opciones[] = new String[5];
        opciones[0] = "-destdir";
        opciones[1] = "src\\compilador\\";
        opciones[2] = "-parser";
        opciones[3] = "parser";
        opciones[4] = "src\\compilador\\parser.cup";

        try
        {
            outputArea.setText(""); // Clear
            outputArea.setText("Compilando archivo .cup ... \n");
            java_cup.Main.main(opciones);
            outputArea.append("archivo .cup compilado exitosamente. \n");

        }
        catch ( Exception e )
        {
            outputArea.setText(e.getMessage());
        }

    }//GEN-LAST:event_compilarCupActionPerformed

    private void compilarJFLEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarJFLEXActionPerformed
        // Compilar con JFLEX el archivo .lex
        outputArea.setText(""); // clear
        outputArea.setText("Compilando archivo .flex ... \n");
        JFlex.Main.generate(new File("src\\compilador\\lexer.flex"));
        outputArea.append("archivo .flex compilado exitosamente. \n");
    }//GEN-LAST:event_compilarJFLEXActionPerformed

    private void guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoActionPerformed
        
        try
        {
            // Verificar si se guardara un archivo abierto
            if ( archivoAbierto != null )
            {
                // Guardar cambios en el archivo actual
                FileWriter fw = new FileWriter(archivoAbierto);
                PrintWriter pw = new PrintWriter(fw);

                pw.write(inputArea.getText());
                outputArea.setText("Archivo se ha guardado exitosamente. \n");
                pw.close();
            }
            else
            {
                // Mostrar JFileChooser para guardar un nuevo archivo
                JFileChooser fc = new JFileChooser();
                int retVal = fc.showSaveDialog(null);

                if ( retVal == fc.APPROVE_OPTION )
                {
                    File nuevoArchivo = new File( fc.getSelectedFile().getAbsolutePath());

                    // Crear el nuevo archivo en el directorio selecionado
                    FileWriter fw = new FileWriter(nuevoArchivo);
                    PrintWriter pw = new PrintWriter(fw);

                    pw.write(inputArea.getText());
                    outputArea.setText("Archivo " + nuevoArchivo.getName() + "se ha guardado exitosamente. \n");
                    pw.close();

                    archivoAbierto = nuevoArchivo;
                }
            }
        }
        catch ( Exception e )
        {
            outputArea.setText(e.getMessage());
        }

    }//GEN-LAST:event_guardarArchivoActionPerformed

    private void limpiarOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarOutputActionPerformed
        // Limpiar el output
        outputArea.setText("");
    }//GEN-LAST:event_limpiarOutputActionPerformed

    private void inputAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_inputAreaCaretUpdate
        int line = 0, column =0, caretpos = inputArea.getCaretPosition();
        String texto = inputArea.getText();

        for( int i = 0; i < caretpos; i++)
            if( texto.charAt(i+line) == 13)
            {
                line++;
                column = 0;
            }
            else
                column++;
        column++;
        line++;

        lineaLabel.setText("Linea: " + line);
        colLabel.setText("Columna: " + column);
        
    }//GEN-LAST:event_inputAreaCaretUpdate

    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Interfaz().setVisible(true);
            }

            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirArchivo;
    private javax.swing.JLabel colLabel;
    private javax.swing.JButton compilarCodigo;
    private javax.swing.JButton compilarCup;
    private javax.swing.JButton compilarJFLEX;
    private javax.swing.JButton guardarArchivo;
    protected static javax.swing.JTextPane inputArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton limpiarOutput;
    private javax.swing.JLabel lineaLabel;
    private javax.swing.JMenuBar menuBar;
    protected static javax.swing.JTextArea outputArea;
    // End of variables declaration//GEN-END:variables

}
