package Ventana;

import java.util.*;
import Modelo.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class InterfazGrafica extends javax.swing.JFrame {
    

    ArrayList<Producto> lista = new ArrayList();
    ArrayList<Producto> listaP = new ArrayList();
    int producto,ordenar;
    File archivoLP = new File("ListaProducto");
     
    
    public InterfazGrafica() throws FileNotFoundException {
        initComponents();
        //this.setLocationRelativeTo(null);
        //this.setSize(930,700);
        //jlistaPrin = new DefaultListModel();
        //jlistaLA = new DefaultListModel();
        //ingresoLPrEA.setModel();
        //ingresoLPrPF.setModel();
        leerArchivo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        mPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textoMenuProducto = new javax.swing.JButton();
        textoMenuCliente = new javax.swing.JButton();
        textoMenuPedido = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        cargarPF = new javax.swing.JButton();
        ListaProductoOrdenado = new javax.swing.JButton();
        cargarPR = new javax.swing.JButton();
        cargarPC = new javax.swing.JButton();
        textoMenu = new javax.swing.JLabel();
        listaProductos = new javax.swing.JButton();
        textoDeProductos = new javax.swing.JLabel();
        volverAlMenuAnteriorMP = new javax.swing.JButton();
        mCargarPF = new javax.swing.JPanel();
        textoCargarPF = new javax.swing.JLabel();
        textoNombrePF = new javax.swing.JLabel();
        textoDescripcionPF = new javax.swing.JLabel();
        PrecioPF = new javax.swing.JLabel();
        textoLotePF = new javax.swing.JLabel();
        ingresoNombrePF = new javax.swing.JTextField();
        ingresoPrecioPF = new javax.swing.JTextField();
        ingresoPaisOPF = new javax.swing.JTextField();
        textoFCPF = new javax.swing.JLabel();
        textoAnioPF = new javax.swing.JLabel();
        textoMesPF = new javax.swing.JLabel();
        textoDiaPF = new javax.swing.JLabel();
        ingresoDescripcionPF = new javax.swing.JScrollPane();
        ingresoDescPF = new javax.swing.JTextArea();
        volverAlMenuAnteriorPF = new javax.swing.JButton();
        cargarMCPF = new javax.swing.JButton();
        aniosFCPF = new javax.swing.JComboBox<>();
        mesesFCPF = new javax.swing.JComboBox<>();
        diasFCPF = new javax.swing.JComboBox<>();
        textoPF = new javax.swing.JLabel();
        textoFEPF = new javax.swing.JLabel();
        textoPaisOPF = new javax.swing.JLabel();
        aniosFEPF = new javax.swing.JComboBox<>();
        mesesFEPF = new javax.swing.JComboBox<>();
        diasFEPF = new javax.swing.JComboBox<>();
        ingresoNroLotePF = new javax.swing.JTextField();
        mCargarPR = new javax.swing.JPanel();
        textoCargarPR = new javax.swing.JLabel();
        textoNombrePR = new javax.swing.JLabel();
        textoDescripcionPR = new javax.swing.JLabel();
        PrecioPR = new javax.swing.JLabel();
        textoLotePR = new javax.swing.JLabel();
        ingresoNombrePR = new javax.swing.JTextField();
        ingresoPrecioPR = new javax.swing.JTextField();
        ingresoCOPR = new javax.swing.JTextField();
        textoFCPR = new javax.swing.JLabel();
        textoAnioPR = new javax.swing.JLabel();
        textoMesPR = new javax.swing.JLabel();
        textoDiaPR = new javax.swing.JLabel();
        ingresoDescripcionPR = new javax.swing.JScrollPane();
        ingresoDescPR = new javax.swing.JTextArea();
        volverAlMenuAnteriorPR = new javax.swing.JButton();
        cargarMCPR = new javax.swing.JButton();
        aniosFCPR = new javax.swing.JComboBox<>();
        mesesFCPR = new javax.swing.JComboBox<>();
        diasFCPR = new javax.swing.JComboBox<>();
        textoPFPR = new javax.swing.JLabel();
        textoCOPR = new javax.swing.JLabel();
        ingresoNroLotePR = new javax.swing.JTextField();
        mCargarPC = new javax.swing.JPanel();
        textoCargarPC = new javax.swing.JLabel();
        textoNombrePC = new javax.swing.JLabel();
        textoDescripcionPC = new javax.swing.JLabel();
        PrecioPC = new javax.swing.JLabel();
        textoLotePC = new javax.swing.JLabel();
        ingresoNombrePC = new javax.swing.JTextField();
        ingresoPrecioPC = new javax.swing.JTextField();
        ingresoTempPC = new javax.swing.JTextField();
        textoFCPC = new javax.swing.JLabel();
        textoAnioPC = new javax.swing.JLabel();
        textoMesPC = new javax.swing.JLabel();
        textoDiaPC = new javax.swing.JLabel();
        ingresoDescripcionPC = new javax.swing.JScrollPane();
        ingresoDescPC = new javax.swing.JTextArea();
        volverAlMenuAnteriorPC = new javax.swing.JButton();
        cargarMCPC = new javax.swing.JButton();
        aniosFCPC = new javax.swing.JComboBox<>();
        mesesFCPC = new javax.swing.JComboBox<>();
        diasFCPC = new javax.swing.JComboBox<>();
        textoPFPC = new javax.swing.JLabel();
        textoTempPC = new javax.swing.JLabel();
        ingresoNroLotePC = new javax.swing.JTextField();
        mEnProceso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bVMA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mListadoDeProductos = new javax.swing.JPanel();
        textoListadoDeProductos = new javax.swing.JLabel();
        vamaLP = new javax.swing.JButton();
        ingresoLP = new javax.swing.JScrollPane();
        ingresoTablaLP = new javax.swing.JTable();
        eliminarLP = new javax.swing.JButton();
        modificarLP = new javax.swing.JButton();
        consultarInfoLP = new javax.swing.JButton();
        mModificar = new javax.swing.JPanel();
        textoMP = new javax.swing.JLabel();
        textoMPPF = new javax.swing.JLabel();
        volverAlMenuAnteriorPF3 = new javax.swing.JButton();
        nombMPPF = new javax.swing.JLabel();
        precioMPPF = new javax.swing.JLabel();
        paisOMPPF = new javax.swing.JLabel();
        fechEMPPF = new javax.swing.JLabel();
        fechCMPPF = new javax.swing.JLabel();
        descripcionMPPF = new javax.swing.JLabel();
        ingresoModNroLote = new javax.swing.JTextField();
        ingresoModPO = new javax.swing.JTextField();
        ingresoModNom = new javax.swing.JTextField();
        aniosMFC = new javax.swing.JComboBox<>();
        mesesMFC = new javax.swing.JComboBox<>();
        diasMFC = new javax.swing.JComboBox<>();
        aniosMFE = new javax.swing.JComboBox<>();
        mesesMFE = new javax.swing.JComboBox<>();
        diasMFE = new javax.swing.JComboBox<>();
        textoAnioMP = new javax.swing.JLabel();
        textoMesMP = new javax.swing.JLabel();
        textoDiaMP = new javax.swing.JLabel();
        bGuardarCambios = new javax.swing.JButton();
        ingresoDMP = new javax.swing.JScrollPane();
        ingresoDeMP = new javax.swing.JTextArea();
        textoNroLote = new javax.swing.JLabel();
        ingresoModPre = new javax.swing.JTextField();
        textoCO1 = new javax.swing.JLabel();
        textoTC1 = new javax.swing.JLabel();
        textoAnioMP3 = new javax.swing.JLabel();
        textoMesMP3 = new javax.swing.JLabel();
        textoDiaMP3 = new javax.swing.JLabel();
        textoMPPR = new javax.swing.JLabel();
        textoMPPC = new javax.swing.JLabel();
        mEliminar = new javax.swing.JPanel();
        textoMP1 = new javax.swing.JLabel();
        textoMPPF1 = new javax.swing.JLabel();
        volverAlMenuAnteriorPF4 = new javax.swing.JButton();
        nombMPPF1 = new javax.swing.JLabel();
        precioMPPF1 = new javax.swing.JLabel();
        paisOMPPF1 = new javax.swing.JLabel();
        fechEMPPF1 = new javax.swing.JLabel();
        fechCMPPF1 = new javax.swing.JLabel();
        descripcionMPPF1 = new javax.swing.JLabel();
        textoAnioMP1 = new javax.swing.JLabel();
        textoMesMP1 = new javax.swing.JLabel();
        textoDiaMP1 = new javax.swing.JLabel();
        bEliminarPermanente = new javax.swing.JButton();
        textoNroLote1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        txtNroLote = new javax.swing.JLabel();
        txtFCDia = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtPO = new javax.swing.JLabel();
        txtFEDia = new javax.swing.JLabel();
        txtFCMes = new javax.swing.JLabel();
        txtFCAnio = new javax.swing.JLabel();
        txtFEAnio = new javax.swing.JLabel();
        txtFEMes = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        textoTC = new javax.swing.JLabel();
        textoAnioMP2 = new javax.swing.JLabel();
        textoMesMP2 = new javax.swing.JLabel();
        textoDiaMP2 = new javax.swing.JLabel();
        txtTC = new javax.swing.JLabel();
        txtCO = new javax.swing.JLabel();
        textoCO = new javax.swing.JLabel();
        mProductosEnOrdenAlfabetico = new javax.swing.JPanel();
        textoListadoDeProductos1 = new javax.swing.JLabel();
        vamaLP1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPEOA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setLayout(new java.awt.CardLayout());

        mPrincipal.setBackground(new java.awt.Color(51, 0, 0));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("MENU");

        textoMenuProducto.setBackground(new java.awt.Color(102, 51, 0));
        textoMenuProducto.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        textoMenuProducto.setForeground(new java.awt.Color(204, 204, 204));
        textoMenuProducto.setText("Producto");
        textoMenuProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMenuProductoActionPerformed(evt);
            }
        });

        textoMenuCliente.setBackground(new java.awt.Color(102, 51, 0));
        textoMenuCliente.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        textoMenuCliente.setForeground(new java.awt.Color(204, 204, 204));
        textoMenuCliente.setText("Cliente");
        textoMenuCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMenuClienteActionPerformed(evt);
            }
        });

        textoMenuPedido.setBackground(new java.awt.Color(102, 51, 0));
        textoMenuPedido.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        textoMenuPedido.setForeground(new java.awt.Color(204, 204, 204));
        textoMenuPedido.setText("Pedido");
        textoMenuPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoMenuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMenuPedidoActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(102, 51, 0));
        Salir.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(204, 204, 204));
        Salir.setText("Salir");
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mPrincipalLayout = new javax.swing.GroupLayout(mPrincipal);
        mPrincipal.setLayout(mPrincipalLayout);
        mPrincipalLayout.setHorizontalGroup(
            mPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPrincipalLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(mPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(mPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoMenuPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoMenuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoMenuProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        mPrincipalLayout.setVerticalGroup(
            mPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(75, 75, 75)
                .addComponent(textoMenuProducto)
                .addGap(69, 69, 69)
                .addComponent(textoMenuCliente)
                .addGap(81, 81, 81)
                .addComponent(textoMenuPedido)
                .addGap(78, 78, 78)
                .addComponent(Salir)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        Principal.add(mPrincipal, "card10");

        menu.setBackground(new java.awt.Color(51, 0, 0));

        cargarPF.setBackground(new java.awt.Color(102, 51, 0));
        cargarPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cargarPF.setForeground(new java.awt.Color(204, 204, 204));
        cargarPF.setText("Cargar Producto Fresco");
        cargarPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPFActionPerformed(evt);
            }
        });

        ListaProductoOrdenado.setBackground(new java.awt.Color(102, 51, 0));
        ListaProductoOrdenado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ListaProductoOrdenado.setForeground(new java.awt.Color(204, 204, 204));
        ListaProductoOrdenado.setText("Ver Productos en Orden Alfabetico");
        ListaProductoOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaProductoOrdenadoActionPerformed(evt);
            }
        });

        cargarPR.setBackground(new java.awt.Color(102, 51, 0));
        cargarPR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cargarPR.setForeground(new java.awt.Color(204, 204, 204));
        cargarPR.setText("Cargar Producto Refigerado");
        cargarPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPRActionPerformed(evt);
            }
        });

        cargarPC.setBackground(new java.awt.Color(102, 51, 0));
        cargarPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cargarPC.setForeground(new java.awt.Color(204, 204, 204));
        cargarPC.setText("Cargar Producto Congelado");
        cargarPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPCActionPerformed(evt);
            }
        });

        textoMenu.setBackground(new java.awt.Color(204, 204, 204));
        textoMenu.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        textoMenu.setForeground(new java.awt.Color(204, 204, 204));
        textoMenu.setText("MENU");

        listaProductos.setBackground(new java.awt.Color(102, 51, 0));
        listaProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaProductos.setForeground(new java.awt.Color(204, 204, 204));
        listaProductos.setText("Ver Lista de Productos");
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });

        textoDeProductos.setBackground(new java.awt.Color(204, 204, 204));
        textoDeProductos.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        textoDeProductos.setForeground(new java.awt.Color(204, 204, 204));
        textoDeProductos.setText("DE PRODUCTOS");

        volverAlMenuAnteriorMP.setBackground(new java.awt.Color(102, 51, 0));
        volverAlMenuAnteriorMP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        volverAlMenuAnteriorMP.setForeground(new java.awt.Color(204, 204, 204));
        volverAlMenuAnteriorMP.setText("Volver Al Menu Anterior");
        volverAlMenuAnteriorMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuAnteriorMPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(textoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(textoDeProductos)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cargarPC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargarPF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargarPR, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaProductoOrdenado, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volverAlMenuAnteriorMP, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(303, 303, 303))))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(textoDeProductos)
                .addGap(49, 49, 49)
                .addComponent(cargarPF)
                .addGap(18, 18, 18)
                .addComponent(cargarPC)
                .addGap(18, 18, 18)
                .addComponent(cargarPR)
                .addGap(18, 18, 18)
                .addComponent(listaProductos)
                .addGap(18, 18, 18)
                .addComponent(ListaProductoOrdenado)
                .addGap(18, 18, 18)
                .addComponent(volverAlMenuAnteriorMP)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        Principal.add(menu, "card11");

        mCargarPF.setBackground(new java.awt.Color(51, 0, 0));

        textoCargarPF.setBackground(new java.awt.Color(204, 204, 204));
        textoCargarPF.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        textoCargarPF.setForeground(new java.awt.Color(204, 204, 204));
        textoCargarPF.setText("CARGAR");

        textoNombrePF.setBackground(new java.awt.Color(153, 153, 153));
        textoNombrePF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNombrePF.setForeground(new java.awt.Color(153, 153, 153));
        textoNombrePF.setText("Nombre:");

        textoDescripcionPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoDescripcionPF.setForeground(new java.awt.Color(153, 153, 153));
        textoDescripcionPF.setText("Descripcion:");

        PrecioPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrecioPF.setForeground(new java.awt.Color(153, 153, 153));
        PrecioPF.setText("Precio:");

        textoLotePF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoLotePF.setForeground(new java.awt.Color(153, 153, 153));
        textoLotePF.setText("Numero de Lote:");

        ingresoNombrePF.setBackground(new java.awt.Color(51, 51, 51));
        ingresoNombrePF.setForeground(new java.awt.Color(204, 204, 204));
        ingresoNombrePF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoNombrePFActionPerformed(evt);
            }
        });

        ingresoPrecioPF.setBackground(new java.awt.Color(51, 51, 51));
        ingresoPrecioPF.setForeground(new java.awt.Color(204, 204, 204));
        ingresoPrecioPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPrecioPFActionPerformed(evt);
            }
        });

        ingresoPaisOPF.setBackground(new java.awt.Color(51, 51, 51));
        ingresoPaisOPF.setForeground(new java.awt.Color(204, 204, 204));
        ingresoPaisOPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPaisOPFActionPerformed(evt);
            }
        });

        textoFCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoFCPF.setForeground(new java.awt.Color(153, 153, 153));
        textoFCPF.setText("Fecha de caducidad:");

        textoAnioPF.setText("AÑO");

        textoMesPF.setText("MES");

        textoDiaPF.setText("DIA");

        ingresoDescripcionPF.setBackground(new java.awt.Color(51, 51, 51));

        ingresoDescPF.setBackground(new java.awt.Color(51, 51, 51));
        ingresoDescPF.setColumns(20);
        ingresoDescPF.setForeground(new java.awt.Color(204, 204, 204));
        ingresoDescPF.setRows(5);
        ingresoDescripcionPF.setViewportView(ingresoDescPF);

        volverAlMenuAnteriorPF.setBackground(new java.awt.Color(102, 51, 0));
        volverAlMenuAnteriorPF.setForeground(new java.awt.Color(204, 204, 204));
        volverAlMenuAnteriorPF.setText("Volver al Menu anterior");
        volverAlMenuAnteriorPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuAnteriorPFActionPerformed(evt);
            }
        });

        cargarMCPF.setBackground(new java.awt.Color(102, 51, 0));
        cargarMCPF.setForeground(new java.awt.Color(204, 204, 204));
        cargarMCPF.setText("Cargar");
        cargarMCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarMCPFActionPerformed(evt);
            }
        });

        aniosFCPF.setBackground(new java.awt.Color(51, 51, 51));
        aniosFCPF.setForeground(new java.awt.Color(204, 204, 204));
        aniosFCPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aniosFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosFCPFActionPerformed(evt);
            }
        });

        mesesFCPF.setBackground(new java.awt.Color(51, 51, 51));
        mesesFCPF.setForeground(new java.awt.Color(204, 204, 204));
        mesesFCPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        diasFCPF.setBackground(new java.awt.Color(51, 51, 51));
        diasFCPF.setForeground(new java.awt.Color(204, 204, 204));
        diasFCPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        textoPF.setBackground(new java.awt.Color(204, 204, 204));
        textoPF.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        textoPF.setForeground(new java.awt.Color(204, 204, 204));
        textoPF.setText("PRODUCTO FRESCO");

        textoFEPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoFEPF.setForeground(new java.awt.Color(153, 153, 153));
        textoFEPF.setText("Fecha de envasado:");

        textoPaisOPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoPaisOPF.setForeground(new java.awt.Color(153, 153, 153));
        textoPaisOPF.setText("Pais de Origen:");

        aniosFEPF.setBackground(new java.awt.Color(51, 51, 51));
        aniosFEPF.setForeground(new java.awt.Color(204, 204, 204));
        aniosFEPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        aniosFEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosFEPFActionPerformed(evt);
            }
        });

        mesesFEPF.setBackground(new java.awt.Color(51, 51, 51));
        mesesFEPF.setForeground(new java.awt.Color(204, 204, 204));
        mesesFEPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        diasFEPF.setBackground(new java.awt.Color(51, 51, 51));
        diasFEPF.setForeground(new java.awt.Color(204, 204, 204));
        diasFEPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ingresoNroLotePF.setBackground(new java.awt.Color(51, 51, 51));
        ingresoNroLotePF.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout mCargarPFLayout = new javax.swing.GroupLayout(mCargarPF);
        mCargarPF.setLayout(mCargarPFLayout);
        mCargarPFLayout.setHorizontalGroup(
            mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCargarPFLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCargarPFLayout.createSequentialGroup()
                        .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mCargarPFLayout.createSequentialGroup()
                                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoDescripcionPF)
                                    .addComponent(PrecioPF)
                                    .addComponent(textoFCPF)
                                    .addComponent(textoNombrePF)
                                    .addComponent(textoLotePF))
                                .addGap(32, 32, 32)
                                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresoDescripcionPF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ingresoNombrePF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ingresoPaisOPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(ingresoPrecioPF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ingresoNroLotePF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                    .addGroup(mCargarPFLayout.createSequentialGroup()
                                        .addComponent(aniosFEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesesFEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(diasFEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mCargarPFLayout.createSequentialGroup()
                                        .addComponent(aniosFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesesFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(diasFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(mCargarPFLayout.createSequentialGroup()
                                .addComponent(volverAlMenuAnteriorPF)
                                .addGap(18, 18, 18)
                                .addComponent(cargarMCPF)))
                        .addGap(61, 302, Short.MAX_VALUE))
                    .addGroup(mCargarPFLayout.createSequentialGroup()
                        .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoFEPF)
                            .addComponent(textoPaisOPF))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(mCargarPFLayout.createSequentialGroup()
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCargarPFLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCargarPF)
                            .addComponent(textoPF)))
                    .addGroup(mCargarPFLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(textoAnioPF)
                        .addGap(41, 41, 41)
                        .addComponent(textoMesPF)
                        .addGap(38, 38, 38)
                        .addComponent(textoDiaPF)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mCargarPFLayout.setVerticalGroup(
            mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCargarPFLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(textoCargarPF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(textoPF)
                .addGap(30, 30, 30)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoNombrePF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombrePF))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoPrecioPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioPF))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLotePF)
                    .addComponent(ingresoNroLotePF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPaisOPF)
                    .addComponent(ingresoPaisOPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFEPF)
                    .addComponent(aniosFEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesFEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diasFEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniosFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diasFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoFCPF))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAnioPF)
                    .addComponent(textoMesPF)
                    .addComponent(textoDiaPF))
                .addGap(18, 18, 18)
                .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresoDescripcionPF, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mCargarPFLayout.createSequentialGroup()
                        .addComponent(textoDescripcionPF)
                        .addGap(104, 104, 104)
                        .addGroup(mCargarPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volverAlMenuAnteriorPF)
                            .addComponent(cargarMCPF))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Principal.add(mCargarPF, "card10");

        mCargarPR.setBackground(new java.awt.Color(51, 0, 0));

        textoCargarPR.setBackground(new java.awt.Color(204, 204, 204));
        textoCargarPR.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        textoCargarPR.setForeground(new java.awt.Color(204, 204, 204));
        textoCargarPR.setText("CARGAR");

        textoNombrePR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNombrePR.setForeground(new java.awt.Color(153, 153, 153));
        textoNombrePR.setText("Nombre:");

        textoDescripcionPR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoDescripcionPR.setForeground(new java.awt.Color(153, 153, 153));
        textoDescripcionPR.setText("Descripcion:");

        PrecioPR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrecioPR.setForeground(new java.awt.Color(153, 153, 153));
        PrecioPR.setText("Precio:");

        textoLotePR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoLotePR.setForeground(new java.awt.Color(153, 153, 153));
        textoLotePR.setText("Numero de Lote:");

        ingresoNombrePR.setBackground(new java.awt.Color(51, 51, 51));
        ingresoNombrePR.setForeground(new java.awt.Color(204, 204, 204));
        ingresoNombrePR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoNombrePRActionPerformed(evt);
            }
        });

        ingresoPrecioPR.setBackground(new java.awt.Color(51, 51, 51));
        ingresoPrecioPR.setForeground(new java.awt.Color(204, 204, 204));
        ingresoPrecioPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPrecioPRActionPerformed(evt);
            }
        });

        ingresoCOPR.setBackground(new java.awt.Color(51, 51, 51));
        ingresoCOPR.setForeground(new java.awt.Color(204, 204, 204));

        textoFCPR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoFCPR.setForeground(new java.awt.Color(153, 153, 153));
        textoFCPR.setText("Fecha de caducidad:");

        textoAnioPR.setForeground(new java.awt.Color(153, 153, 153));
        textoAnioPR.setText("AÑO");

        textoMesPR.setForeground(new java.awt.Color(153, 153, 153));
        textoMesPR.setText("MES");

        textoDiaPR.setForeground(new java.awt.Color(153, 153, 153));
        textoDiaPR.setText("DIA");

        ingresoDescripcionPR.setBackground(new java.awt.Color(51, 51, 51));
        ingresoDescripcionPR.setForeground(new java.awt.Color(153, 153, 153));

        ingresoDescPR.setBackground(new java.awt.Color(51, 51, 51));
        ingresoDescPR.setColumns(20);
        ingresoDescPR.setForeground(new java.awt.Color(204, 204, 204));
        ingresoDescPR.setRows(5);
        ingresoDescripcionPR.setViewportView(ingresoDescPR);

        volverAlMenuAnteriorPR.setBackground(new java.awt.Color(102, 51, 0));
        volverAlMenuAnteriorPR.setForeground(new java.awt.Color(204, 204, 204));
        volverAlMenuAnteriorPR.setText("Volver al Menu anterior");
        volverAlMenuAnteriorPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuAnteriorPRActionPerformed(evt);
            }
        });

        cargarMCPR.setBackground(new java.awt.Color(102, 51, 0));
        cargarMCPR.setForeground(new java.awt.Color(204, 204, 204));
        cargarMCPR.setText("Cargar");
        cargarMCPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarMCPRActionPerformed(evt);
            }
        });

        aniosFCPR.setBackground(new java.awt.Color(51, 51, 51));
        aniosFCPR.setForeground(new java.awt.Color(204, 204, 204));
        aniosFCPR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aniosFCPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosFCPRActionPerformed(evt);
            }
        });

        mesesFCPR.setBackground(new java.awt.Color(51, 51, 51));
        mesesFCPR.setForeground(new java.awt.Color(204, 204, 204));
        mesesFCPR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        diasFCPR.setBackground(new java.awt.Color(51, 51, 51));
        diasFCPR.setForeground(new java.awt.Color(204, 204, 204));
        diasFCPR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        textoPFPR.setBackground(new java.awt.Color(204, 204, 204));
        textoPFPR.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        textoPFPR.setForeground(new java.awt.Color(204, 204, 204));
        textoPFPR.setText("PRODUCTO REFRIGERADO");

        textoCOPR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoCOPR.setForeground(new java.awt.Color(153, 153, 153));
        textoCOPR.setText("Codigo del organismo:");

        ingresoNroLotePR.setBackground(new java.awt.Color(51, 51, 51));
        ingresoNroLotePR.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout mCargarPRLayout = new javax.swing.GroupLayout(mCargarPR);
        mCargarPR.setLayout(mCargarPRLayout);
        mCargarPRLayout.setHorizontalGroup(
            mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCargarPRLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCargarPRLayout.createSequentialGroup()
                        .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mCargarPRLayout.createSequentialGroup()
                                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoDescripcionPR)
                                    .addComponent(PrecioPR)
                                    .addComponent(textoNombrePR)
                                    .addComponent(textoLotePR))
                                .addGap(51, 51, 51)
                                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresoDescripcionPR, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ingresoNombrePR, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ingresoCOPR, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ingresoPrecioPR, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ingresoNroLotePR, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mCargarPRLayout.createSequentialGroup()
                                            .addComponent(aniosFCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(mesesFCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diasFCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(mCargarPRLayout.createSequentialGroup()
                                .addComponent(volverAlMenuAnteriorPR)
                                .addGap(18, 18, 18)
                                .addComponent(cargarMCPR)))
                        .addGap(61, 305, Short.MAX_VALUE))
                    .addGroup(mCargarPRLayout.createSequentialGroup()
                        .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoFCPR)
                            .addComponent(textoCOPR))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(mCargarPRLayout.createSequentialGroup()
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCargarPRLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCargarPR)
                            .addComponent(textoPFPR)))
                    .addGroup(mCargarPRLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(textoAnioPR)
                        .addGap(43, 43, 43)
                        .addComponent(textoMesPR)
                        .addGap(36, 36, 36)
                        .addComponent(textoDiaPR)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mCargarPRLayout.setVerticalGroup(
            mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCargarPRLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(textoCargarPR, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(textoPFPR)
                .addGap(30, 30, 30)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoNombrePR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombrePR))
                .addGap(18, 18, 18)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoPrecioPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioPR))
                .addGap(18, 18, 18)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLotePR)
                    .addComponent(ingresoNroLotePR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCOPR)
                    .addComponent(ingresoCOPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFCPR)
                    .addComponent(aniosFCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesFCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diasFCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDiaPR)
                    .addComponent(textoMesPR)
                    .addComponent(textoAnioPR))
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCargarPRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ingresoDescripcionPR, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mCargarPRLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(textoDescripcionPR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(mCargarPRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverAlMenuAnteriorPR)
                    .addComponent(cargarMCPR))
                .addGap(74, 74, 74))
        );

        Principal.add(mCargarPR, "card10");

        mCargarPC.setBackground(new java.awt.Color(51, 0, 0));

        textoCargarPC.setBackground(new java.awt.Color(204, 204, 204));
        textoCargarPC.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        textoCargarPC.setForeground(new java.awt.Color(204, 204, 204));
        textoCargarPC.setText("CARGAR");

        textoNombrePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNombrePC.setForeground(new java.awt.Color(153, 153, 153));
        textoNombrePC.setText("Nombre:");

        textoDescripcionPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoDescripcionPC.setForeground(new java.awt.Color(153, 153, 153));
        textoDescripcionPC.setText("Descripcion:");

        PrecioPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrecioPC.setForeground(new java.awt.Color(153, 153, 153));
        PrecioPC.setText("Precio:");

        textoLotePC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoLotePC.setForeground(new java.awt.Color(153, 153, 153));
        textoLotePC.setText("Numero de Lote:");

        ingresoNombrePC.setBackground(new java.awt.Color(51, 51, 51));
        ingresoNombrePC.setForeground(new java.awt.Color(204, 204, 204));
        ingresoNombrePC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoNombrePCActionPerformed(evt);
            }
        });

        ingresoPrecioPC.setBackground(new java.awt.Color(51, 51, 51));
        ingresoPrecioPC.setForeground(new java.awt.Color(204, 204, 204));
        ingresoPrecioPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPrecioPCActionPerformed(evt);
            }
        });

        ingresoTempPC.setBackground(new java.awt.Color(51, 51, 51));
        ingresoTempPC.setForeground(new java.awt.Color(204, 204, 204));

        textoFCPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoFCPC.setForeground(new java.awt.Color(153, 153, 153));
        textoFCPC.setText("Fecha de caducidad:");

        textoAnioPC.setForeground(new java.awt.Color(153, 153, 153));
        textoAnioPC.setText("AÑO");

        textoMesPC.setForeground(new java.awt.Color(153, 153, 153));
        textoMesPC.setText("MES");

        textoDiaPC.setForeground(new java.awt.Color(153, 153, 153));
        textoDiaPC.setText("DIA");

        ingresoDescripcionPC.setBackground(new java.awt.Color(51, 51, 51));
        ingresoDescripcionPC.setForeground(new java.awt.Color(51, 51, 51));

        ingresoDescPC.setBackground(new java.awt.Color(51, 51, 51));
        ingresoDescPC.setColumns(20);
        ingresoDescPC.setForeground(new java.awt.Color(204, 204, 204));
        ingresoDescPC.setRows(5);
        ingresoDescripcionPC.setViewportView(ingresoDescPC);

        volverAlMenuAnteriorPC.setBackground(new java.awt.Color(102, 51, 0));
        volverAlMenuAnteriorPC.setForeground(new java.awt.Color(204, 204, 204));
        volverAlMenuAnteriorPC.setText("Volver al Menu anterior");
        volverAlMenuAnteriorPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuAnteriorPCActionPerformed(evt);
            }
        });

        cargarMCPC.setBackground(new java.awt.Color(102, 51, 0));
        cargarMCPC.setForeground(new java.awt.Color(204, 204, 204));
        cargarMCPC.setText("Cargar");
        cargarMCPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarMCPCActionPerformed(evt);
            }
        });

        aniosFCPC.setBackground(new java.awt.Color(51, 51, 51));
        aniosFCPC.setForeground(new java.awt.Color(204, 204, 204));
        aniosFCPC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aniosFCPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosFCPCActionPerformed(evt);
            }
        });

        mesesFCPC.setBackground(new java.awt.Color(51, 51, 51));
        mesesFCPC.setForeground(new java.awt.Color(204, 204, 204));
        mesesFCPC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        diasFCPC.setBackground(new java.awt.Color(51, 51, 51));
        diasFCPC.setForeground(new java.awt.Color(204, 204, 204));
        diasFCPC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        textoPFPC.setBackground(new java.awt.Color(204, 204, 204));
        textoPFPC.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        textoPFPC.setForeground(new java.awt.Color(204, 204, 204));
        textoPFPC.setText("PRODUCTO CONGELADO");

        textoTempPC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoTempPC.setForeground(new java.awt.Color(153, 153, 153));
        textoTempPC.setText("Temperatura de congelacion:");

        ingresoNroLotePC.setBackground(new java.awt.Color(51, 51, 51));
        ingresoNroLotePC.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout mCargarPCLayout = new javax.swing.GroupLayout(mCargarPC);
        mCargarPC.setLayout(mCargarPCLayout);
        mCargarPCLayout.setHorizontalGroup(
            mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCargarPCLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(textoPFPC)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mCargarPCLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mCargarPCLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrecioPC)
                                    .addComponent(textoLotePC)
                                    .addComponent(textoNombrePC))
                                .addGap(593, 593, 593))
                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addComponent(textoCargarPC)
                                .addGap(418, 418, 418))))
                    .addGroup(mCargarPCLayout.createSequentialGroup()
                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoFCPC)
                                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoTempPC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoDescripcionPC)))
                            .addComponent(volverAlMenuAnteriorPC))
                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresoTempPC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mCargarPCLayout.createSequentialGroup()
                                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(aniosFCPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(textoAnioPC)))
                                        .addGap(18, 18, 18)
                                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mesesFCPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(textoMesPC)))
                                        .addGap(18, 18, 18)
                                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(textoDiaPC))
                                            .addComponent(diasFCPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ingresoNroLotePC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresoPrecioPC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresoNombrePC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresoDescripcionPC, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mCargarPCLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(cargarMCPC)))
                        .addGap(0, 282, Short.MAX_VALUE))))
        );
        mCargarPCLayout.setVerticalGroup(
            mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mCargarPCLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(textoCargarPC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(textoPFPC)
                .addGap(30, 30, 30)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoNombrePC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombrePC))
                .addGap(18, 18, 18)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoPrecioPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioPC))
                .addGap(18, 18, 18)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLotePC)
                    .addComponent(ingresoNroLotePC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTempPC)
                    .addComponent(ingresoTempPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFCPC)
                    .addComponent(aniosFCPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesesFCPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diasFCPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAnioPC)
                    .addComponent(textoMesPC)
                    .addComponent(textoDiaPC))
                .addGap(18, 18, 18)
                .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresoDescripcionPC, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mCargarPCLayout.createSequentialGroup()
                        .addComponent(textoDescripcionPC)
                        .addGap(115, 115, 115)
                        .addGroup(mCargarPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volverAlMenuAnteriorPC)
                            .addComponent(cargarMCPC))))
                .addContainerGap())
        );

        Principal.add(mCargarPC, "card10");

        mEnProceso.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("LA FUNCIONALIDAD ");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("SERA AÑADIDA");

        bVMA.setBackground(new java.awt.Color(102, 51, 0));
        bVMA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bVMA.setForeground(new java.awt.Color(204, 204, 204));
        bVMA.setText("Volver al menu anterior");
        bVMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVMAActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("PROXIMAMENTE");

        javax.swing.GroupLayout mEnProcesoLayout = new javax.swing.GroupLayout(mEnProceso);
        mEnProceso.setLayout(mEnProcesoLayout);
        mEnProcesoLayout.setHorizontalGroup(
            mEnProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mEnProcesoLayout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(mEnProcesoLayout.createSequentialGroup()
                .addGroup(mEnProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mEnProcesoLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(mEnProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(mEnProcesoLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(bVMA)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mEnProcesoLayout.setVerticalGroup(
            mEnProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mEnProcesoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(bVMA)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        Principal.add(mEnProceso, "card6");

        mListadoDeProductos.setBackground(new java.awt.Color(51, 0, 0));
        mListadoDeProductos.setLayout(null);

        textoListadoDeProductos.setBackground(new java.awt.Color(204, 204, 204));
        textoListadoDeProductos.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        textoListadoDeProductos.setForeground(new java.awt.Color(204, 204, 204));
        textoListadoDeProductos.setText("Listado de productos");
        mListadoDeProductos.add(textoListadoDeProductos);
        textoListadoDeProductos.setBounds(80, 30, 660, 37);

        vamaLP.setBackground(new java.awt.Color(102, 51, 0));
        vamaLP.setForeground(new java.awt.Color(204, 204, 204));
        vamaLP.setText("Volver al Menu Anterior");
        vamaLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vamaLPActionPerformed(evt);
            }
        });
        mListadoDeProductos.add(vamaLP);
        vamaLP.setBounds(40, 570, 170, 30);

        ingresoLP.setBackground(new java.awt.Color(51, 51, 51));
        ingresoLP.setForeground(new java.awt.Color(51, 51, 51));

        ingresoTablaLP.setBackground(new java.awt.Color(204, 204, 204));
        ingresoTablaLP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Tipo"
            }
        ));
        ingresoTablaLP.setToolTipText("");
        ingresoTablaLP.setColumnSelectionAllowed(true);
        ingresoTablaLP.setMinimumSize(new java.awt.Dimension(30, 100));
        ingresoTablaLP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ingresoTablaLP.setShowGrid(true);
        ingresoLP.setViewportView(ingresoTablaLP);

        mListadoDeProductos.add(ingresoLP);
        ingresoLP.setBounds(90, 130, 650, 300);

        eliminarLP.setBackground(new java.awt.Color(102, 51, 0));
        eliminarLP.setForeground(new java.awt.Color(204, 204, 204));
        eliminarLP.setText("Eliminar");
        eliminarLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLPActionPerformed(evt);
            }
        });
        mListadoDeProductos.add(eliminarLP);
        eliminarLP.setBounds(610, 450, 100, 30);

        modificarLP.setBackground(new java.awt.Color(102, 51, 0));
        modificarLP.setForeground(new java.awt.Color(204, 204, 204));
        modificarLP.setText("Modificar");
        modificarLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarLPActionPerformed(evt);
            }
        });
        mListadoDeProductos.add(modificarLP);
        modificarLP.setBounds(120, 450, 100, 30);

        consultarInfoLP.setBackground(new java.awt.Color(102, 51, 0));
        consultarInfoLP.setForeground(new java.awt.Color(204, 204, 204));
        consultarInfoLP.setText("Consultar información");
        consultarInfoLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarInfoLPActionPerformed(evt);
            }
        });
        mListadoDeProductos.add(consultarInfoLP);
        consultarInfoLP.setBounds(340, 450, 150, 30);

        Principal.add(mListadoDeProductos, "card7");

        mModificar.setBackground(new java.awt.Color(51, 0, 0));
        mModificar.setLayout(null);

        textoMP.setBackground(new java.awt.Color(204, 204, 204));
        textoMP.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        textoMP.setForeground(new java.awt.Color(204, 204, 204));
        textoMP.setText("Mostrando persona");
        mModificar.add(textoMP);
        textoMP.setBounds(110, 35, 620, 70);

        textoMPPF.setBackground(new java.awt.Color(204, 204, 204));
        textoMPPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMPPF.setForeground(new java.awt.Color(204, 204, 204));
        textoMPPF.setText("Producto Fresco");
        mModificar.add(textoMPPF);
        textoMPPF.setBounds(110, 124, 113, 17);

        volverAlMenuAnteriorPF3.setBackground(new java.awt.Color(102, 51, 0));
        volverAlMenuAnteriorPF3.setForeground(new java.awt.Color(204, 204, 204));
        volverAlMenuAnteriorPF3.setText("Volver al Menu anterior");
        volverAlMenuAnteriorPF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuAnteriorPF3ActionPerformed(evt);
            }
        });
        mModificar.add(volverAlMenuAnteriorPF3);
        volverAlMenuAnteriorPF3.setBounds(90, 630, 160, 30);

        nombMPPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombMPPF.setForeground(new java.awt.Color(153, 153, 153));
        nombMPPF.setText("Nombre: ");
        mModificar.add(nombMPPF);
        nombMPPF.setBounds(160, 177, 90, 30);

        precioMPPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precioMPPF.setForeground(new java.awt.Color(153, 153, 153));
        precioMPPF.setText("Precio: ");
        mModificar.add(precioMPPF);
        precioMPPF.setBounds(160, 230, 70, 30);

        paisOMPPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paisOMPPF.setForeground(new java.awt.Color(153, 153, 153));
        paisOMPPF.setText("Pais de Origen:");
        mModificar.add(paisOMPPF);
        paisOMPPF.setBounds(160, 500, 110, 30);

        fechEMPPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechEMPPF.setForeground(new java.awt.Color(153, 153, 153));
        fechEMPPF.setText("Fecha de Envasado:");
        mModificar.add(fechEMPPF);
        fechEMPPF.setBounds(160, 540, 140, 30);

        fechCMPPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechCMPPF.setForeground(new java.awt.Color(153, 153, 153));
        fechCMPPF.setText("Fecha de Caducidad:");
        mModificar.add(fechCMPPF);
        fechCMPPF.setBounds(160, 430, 140, 30);

        descripcionMPPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionMPPF.setForeground(new java.awt.Color(153, 153, 153));
        descripcionMPPF.setText("Descripcion:");
        mModificar.add(descripcionMPPF);
        descripcionMPPF.setBounds(160, 330, 100, 40);

        ingresoModNroLote.setBackground(new java.awt.Color(51, 51, 51));
        ingresoModNroLote.setForeground(new java.awt.Color(204, 204, 204));
        mModificar.add(ingresoModNroLote);
        ingresoModNroLote.setBounds(350, 280, 200, 30);

        ingresoModPO.setBackground(new java.awt.Color(51, 51, 51));
        ingresoModPO.setForeground(new java.awt.Color(204, 204, 204));
        mModificar.add(ingresoModPO);
        ingresoModPO.setBounds(350, 500, 200, 30);

        ingresoModNom.setBackground(new java.awt.Color(51, 51, 51));
        ingresoModNom.setForeground(new java.awt.Color(204, 204, 204));
        mModificar.add(ingresoModNom);
        ingresoModNom.setBounds(350, 180, 200, 30);

        aniosMFC.setBackground(new java.awt.Color(51, 51, 51));
        aniosMFC.setForeground(new java.awt.Color(204, 204, 204));
        aniosMFC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        aniosMFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosMFCActionPerformed(evt);
            }
        });
        mModificar.add(aniosMFC);
        aniosMFC.setBounds(350, 430, 80, 30);

        mesesMFC.setBackground(new java.awt.Color(51, 51, 51));
        mesesMFC.setForeground(new java.awt.Color(204, 204, 204));
        mesesMFC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        mModificar.add(mesesMFC);
        mesesMFC.setBounds(440, 430, 50, 30);

        diasMFC.setBackground(new java.awt.Color(51, 51, 51));
        diasMFC.setForeground(new java.awt.Color(204, 204, 204));
        diasMFC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        mModificar.add(diasMFC);
        diasMFC.setBounds(500, 430, 50, 30);

        aniosMFE.setBackground(new java.awt.Color(51, 51, 51));
        aniosMFE.setForeground(new java.awt.Color(204, 204, 204));
        aniosMFE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        aniosMFE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosMFEActionPerformed(evt);
            }
        });
        mModificar.add(aniosMFE);
        aniosMFE.setBounds(350, 540, 80, 30);

        mesesMFE.setBackground(new java.awt.Color(51, 51, 51));
        mesesMFE.setForeground(new java.awt.Color(204, 204, 204));
        mesesMFE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        mModificar.add(mesesMFE);
        mesesMFE.setBounds(440, 540, 50, 30);

        diasMFE.setBackground(new java.awt.Color(51, 51, 51));
        diasMFE.setForeground(new java.awt.Color(204, 204, 204));
        diasMFE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        mModificar.add(diasMFE);
        diasMFE.setBounds(500, 540, 50, 30);

        textoAnioMP.setForeground(new java.awt.Color(153, 153, 153));
        textoAnioMP.setText("AÑO");
        mModificar.add(textoAnioMP);
        textoAnioMP.setBounds(370, 470, 40, 20);

        textoMesMP.setForeground(new java.awt.Color(153, 153, 153));
        textoMesMP.setText("MES");
        mModificar.add(textoMesMP);
        textoMesMP.setBounds(450, 470, 40, 20);

        textoDiaMP.setForeground(new java.awt.Color(153, 153, 153));
        textoDiaMP.setText("DIA");
        mModificar.add(textoDiaMP);
        textoDiaMP.setBounds(510, 470, 40, 20);

        bGuardarCambios.setBackground(new java.awt.Color(102, 51, 0));
        bGuardarCambios.setForeground(new java.awt.Color(204, 204, 204));
        bGuardarCambios.setText("Guardar Cambios");
        bGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarCambiosActionPerformed(evt);
            }
        });
        mModificar.add(bGuardarCambios);
        bGuardarCambios.setBounds(280, 630, 160, 30);

        ingresoDeMP.setBackground(new java.awt.Color(51, 51, 51));
        ingresoDeMP.setColumns(20);
        ingresoDeMP.setForeground(new java.awt.Color(204, 204, 204));
        ingresoDeMP.setRows(5);
        ingresoDMP.setViewportView(ingresoDeMP);

        mModificar.add(ingresoDMP);
        ingresoDMP.setBounds(350, 330, 200, 83);

        textoNroLote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNroLote.setForeground(new java.awt.Color(153, 153, 153));
        textoNroLote.setText("Numero de Lote:");
        mModificar.add(textoNroLote);
        textoNroLote.setBounds(160, 280, 120, 30);

        ingresoModPre.setBackground(new java.awt.Color(51, 51, 51));
        ingresoModPre.setForeground(new java.awt.Color(204, 204, 204));
        mModificar.add(ingresoModPre);
        ingresoModPre.setBounds(350, 230, 200, 30);

        textoCO1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoCO1.setForeground(new java.awt.Color(153, 153, 153));
        textoCO1.setText("Codigo de Organismo");
        mModificar.add(textoCO1);
        textoCO1.setBounds(160, 490, 150, 50);

        textoTC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoTC1.setForeground(new java.awt.Color(153, 153, 153));
        textoTC1.setText("Temperatura de Congelacion:");
        mModificar.add(textoTC1);
        textoTC1.setBounds(160, 490, 210, 50);

        textoAnioMP3.setForeground(new java.awt.Color(153, 153, 153));
        textoAnioMP3.setText("AÑO");
        mModificar.add(textoAnioMP3);
        textoAnioMP3.setBounds(370, 580, 40, 20);

        textoMesMP3.setForeground(new java.awt.Color(153, 153, 153));
        textoMesMP3.setText("MES");
        mModificar.add(textoMesMP3);
        textoMesMP3.setBounds(450, 580, 40, 20);

        textoDiaMP3.setForeground(new java.awt.Color(153, 153, 153));
        textoDiaMP3.setText("DIA");
        mModificar.add(textoDiaMP3);
        textoDiaMP3.setBounds(510, 580, 40, 20);

        textoMPPR.setBackground(new java.awt.Color(204, 204, 204));
        textoMPPR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMPPR.setForeground(new java.awt.Color(204, 204, 204));
        textoMPPR.setText("Producto Refrigerado");
        mModificar.add(textoMPPR);
        textoMPPR.setBounds(110, 124, 160, 17);

        textoMPPC.setBackground(new java.awt.Color(204, 204, 204));
        textoMPPC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMPPC.setForeground(new java.awt.Color(204, 204, 204));
        textoMPPC.setText("Producto Congelado");
        mModificar.add(textoMPPC);
        textoMPPC.setBounds(110, 124, 170, 20);

        Principal.add(mModificar, "card8");

        mEliminar.setBackground(new java.awt.Color(51, 0, 0));
        mEliminar.setLayout(null);

        textoMP1.setBackground(new java.awt.Color(204, 204, 204));
        textoMP1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        textoMP1.setForeground(new java.awt.Color(204, 204, 204));
        textoMP1.setText("Mostrando persona");
        mEliminar.add(textoMP1);
        textoMP1.setBounds(110, 35, 600, 60);

        textoMPPF1.setBackground(new java.awt.Color(204, 204, 204));
        textoMPPF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMPPF1.setForeground(new java.awt.Color(204, 204, 204));
        textoMPPF1.setText("Producto Fresco");
        mEliminar.add(textoMPPF1);
        textoMPPF1.setBounds(110, 124, 113, 17);

        volverAlMenuAnteriorPF4.setBackground(new java.awt.Color(102, 51, 0));
        volverAlMenuAnteriorPF4.setForeground(new java.awt.Color(204, 204, 204));
        volverAlMenuAnteriorPF4.setText("Volver al Menu anterior");
        volverAlMenuAnteriorPF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuAnteriorPF4ActionPerformed(evt);
            }
        });
        mEliminar.add(volverAlMenuAnteriorPF4);
        volverAlMenuAnteriorPF4.setBounds(100, 630, 160, 30);

        nombMPPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombMPPF1.setForeground(new java.awt.Color(153, 153, 153));
        nombMPPF1.setText("Nombre: ");
        mEliminar.add(nombMPPF1);
        nombMPPF1.setBounds(160, 190, 58, 17);

        precioMPPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precioMPPF1.setForeground(new java.awt.Color(153, 153, 153));
        precioMPPF1.setText("Precio: ");
        mEliminar.add(precioMPPF1);
        precioMPPF1.setBounds(160, 240, 46, 17);

        paisOMPPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paisOMPPF1.setForeground(new java.awt.Color(153, 153, 153));
        paisOMPPF1.setText("Pais de Origen:");
        mEliminar.add(paisOMPPF1);
        paisOMPPF1.setBounds(160, 490, 110, 30);

        fechEMPPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechEMPPF1.setForeground(new java.awt.Color(153, 153, 153));
        fechEMPPF1.setText("Fecha de Envasado:");
        mEliminar.add(fechEMPPF1);
        fechEMPPF1.setBounds(160, 530, 140, 30);

        fechCMPPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechCMPPF1.setForeground(new java.awt.Color(153, 153, 153));
        fechCMPPF1.setText("Fecha de Caducidad:");
        mEliminar.add(fechCMPPF1);
        fechCMPPF1.setBounds(160, 330, 140, 30);

        descripcionMPPF1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionMPPF1.setForeground(new java.awt.Color(153, 153, 153));
        descripcionMPPF1.setText("Descripcion:");
        mEliminar.add(descripcionMPPF1);
        descripcionMPPF1.setBounds(160, 400, 75, 17);

        textoAnioMP1.setForeground(new java.awt.Color(153, 153, 153));
        textoAnioMP1.setText("AÑO");
        mEliminar.add(textoAnioMP1);
        textoAnioMP1.setBounds(360, 570, 40, 20);

        textoMesMP1.setForeground(new java.awt.Color(153, 153, 153));
        textoMesMP1.setText("MES");
        mEliminar.add(textoMesMP1);
        textoMesMP1.setBounds(430, 570, 40, 20);

        textoDiaMP1.setForeground(new java.awt.Color(153, 153, 153));
        textoDiaMP1.setText("DIA");
        mEliminar.add(textoDiaMP1);
        textoDiaMP1.setBounds(500, 570, 40, 20);

        bEliminarPermanente.setBackground(new java.awt.Color(102, 51, 0));
        bEliminarPermanente.setForeground(new java.awt.Color(204, 204, 204));
        bEliminarPermanente.setText("Eliminar Producto");
        bEliminarPermanente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarPermanenteActionPerformed(evt);
            }
        });
        mEliminar.add(bEliminarPermanente);
        bEliminarPermanente.setBounds(290, 630, 160, 30);

        textoNroLote1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNroLote1.setForeground(new java.awt.Color(153, 153, 153));
        textoNroLote1.setText("Numero de Lote:");
        mEliminar.add(textoNroLote1);
        textoNroLote1.setBounds(160, 280, 120, 40);

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtDescripcion.setOpaque(true);
        mEliminar.add(txtDescripcion);
        txtDescripcion.setBounds(350, 400, 190, 70);

        txtNroLote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNroLote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtNroLote.setOpaque(true);
        mEliminar.add(txtNroLote);
        txtNroLote.setBounds(350, 280, 190, 30);

        txtFCDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFCDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtFCDia.setOpaque(true);
        mEliminar.add(txtFCDia);
        txtFCDia.setBounds(490, 330, 50, 30);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtPrecio.setOpaque(true);
        mEliminar.add(txtPrecio);
        txtPrecio.setBounds(350, 230, 190, 30);

        txtPO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtPO.setOpaque(true);
        mEliminar.add(txtPO);
        txtPO.setBounds(350, 490, 190, 30);

        txtFEDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFEDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtFEDia.setOpaque(true);
        mEliminar.add(txtFEDia);
        txtFEDia.setBounds(490, 530, 50, 30);

        txtFCMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFCMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtFCMes.setOpaque(true);
        mEliminar.add(txtFCMes);
        txtFCMes.setBounds(420, 330, 50, 30);

        txtFCAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFCAnio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtFCAnio.setOpaque(true);
        mEliminar.add(txtFCAnio);
        txtFCAnio.setBounds(350, 330, 50, 30);

        txtFEAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFEAnio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtFEAnio.setOpaque(true);
        mEliminar.add(txtFEAnio);
        txtFEAnio.setBounds(350, 530, 50, 30);

        txtFEMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFEMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtFEMes.setOpaque(true);
        mEliminar.add(txtFEMes);
        txtFEMes.setBounds(420, 530, 50, 30);

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)));
        txtNombre.setOpaque(true);
        mEliminar.add(txtNombre);
        txtNombre.setBounds(350, 180, 190, 30);

        textoTC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoTC.setForeground(new java.awt.Color(153, 153, 153));
        textoTC.setText("Temperatura de Congelacion:");
        mEliminar.add(textoTC);
        textoTC.setBounds(160, 480, 210, 50);

        textoAnioMP2.setForeground(new java.awt.Color(153, 153, 153));
        textoAnioMP2.setText("AÑO");
        mEliminar.add(textoAnioMP2);
        textoAnioMP2.setBounds(360, 370, 40, 20);

        textoMesMP2.setForeground(new java.awt.Color(153, 153, 153));
        textoMesMP2.setText("MES");
        mEliminar.add(textoMesMP2);
        textoMesMP2.setBounds(430, 370, 40, 20);

        textoDiaMP2.setForeground(new java.awt.Color(153, 153, 153));
        textoDiaMP2.setText("DIA");
        mEliminar.add(textoDiaMP2);
        textoDiaMP2.setBounds(500, 370, 40, 20);

        txtTC.setBackground(new java.awt.Color(255, 255, 255));
        txtTC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        txtTC.setOpaque(true);
        mEliminar.add(txtTC);
        txtTC.setBounds(350, 490, 190, 30);

        txtCO.setBackground(new java.awt.Color(255, 255, 255));
        txtCO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        txtCO.setOpaque(true);
        mEliminar.add(txtCO);
        txtCO.setBounds(350, 490, 190, 30);

        textoCO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoCO.setForeground(new java.awt.Color(153, 153, 153));
        textoCO.setText("Codigo de Organismo");
        mEliminar.add(textoCO);
        textoCO.setBounds(160, 480, 150, 50);

        Principal.add(mEliminar, "card8");

        mProductosEnOrdenAlfabetico.setBackground(new java.awt.Color(51, 0, 0));
        mProductosEnOrdenAlfabetico.setLayout(null);

        textoListadoDeProductos1.setBackground(new java.awt.Color(204, 204, 204));
        textoListadoDeProductos1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        textoListadoDeProductos1.setForeground(new java.awt.Color(204, 204, 204));
        textoListadoDeProductos1.setText("Listado de productos ");
        mProductosEnOrdenAlfabetico.add(textoListadoDeProductos1);
        textoListadoDeProductos1.setBounds(90, 70, 680, 70);

        vamaLP1.setBackground(new java.awt.Color(102, 51, 0));
        vamaLP1.setForeground(new java.awt.Color(204, 204, 204));
        vamaLP1.setText("Volver al Menu Anterior");
        vamaLP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vamaLP1ActionPerformed(evt);
            }
        });
        mProductosEnOrdenAlfabetico.add(vamaLP1);
        vamaLP1.setBounds(40, 590, 170, 30);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("en orden alfabetico");
        mProductosEnOrdenAlfabetico.add(jLabel4);
        jLabel4.setBounds(120, 130, 620, 60);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tablaPEOA.setBackground(new java.awt.Color(204, 204, 204));
        tablaPEOA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaPEOA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del Producto", "Tipo de Producto"
            }
        ));
        tablaPEOA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaPEOA.setGridColor(new java.awt.Color(51, 51, 51));
        tablaPEOA.setMinimumSize(new java.awt.Dimension(30, 100));
        tablaPEOA.setShowGrid(true);
        jScrollPane1.setViewportView(tablaPEOA);

        mProductosEnOrdenAlfabetico.add(jScrollPane1);
        jScrollPane1.setBounds(70, 240, 690, 290);

        Principal.add(mProductosEnOrdenAlfabetico, "card7");

        getContentPane().add(Principal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaProductoOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaProductoOrdenadoActionPerformed
            Collections.sort( listaP,new OrdenarProductoPorNombre());
            mostrar(tablaPEOA,2);
            Principal.removeAll();
            Principal.add(mProductosEnOrdenAlfabetico);
            Principal.repaint();
            Principal.revalidate();
    }//GEN-LAST:event_ListaProductoOrdenadoActionPerformed

    private void cargarPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPFActionPerformed
           //¿RESETEAR mCargar?
           Principal.removeAll();
           ingresoNombrePF.setText("");
           ingresoPrecioPF.setText("");
           ingresoNroLotePF.setText("");
           ingresoPaisOPF.setText("");
           ingresoDescPF.setText("");
           Principal.add(mCargarPF);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_cargarPFActionPerformed

    private void cargarPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPRActionPerformed
           Principal.removeAll();
           ingresoNombrePR.setText("");
           ingresoPrecioPR.setText("");
           ingresoNroLotePR.setText("");
           ingresoCOPR.setText("");
           ingresoDescPR.setText("");
           Principal.add(mCargarPR);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_cargarPRActionPerformed

    private void cargarPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPCActionPerformed
           Principal.removeAll();
           ingresoNombrePC.setText("");
           ingresoPrecioPC.setText("");
           ingresoNroLotePC.setText("");
           ingresoTempPC.setText("");
           ingresoDescPC.setText("");
           Principal.add(mCargarPC);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_cargarPCActionPerformed

    private void ingresoNombrePFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoNombrePFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNombrePFActionPerformed

    private void ingresoPrecioPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPrecioPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoPrecioPFActionPerformed

    private void volverAlMenuAnteriorPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuAnteriorPFActionPerformed
           Principal.removeAll();
           Principal.add(menu);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_volverAlMenuAnteriorPFActionPerformed

    private void aniosFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosFCPFActionPerformed
        
    }//GEN-LAST:event_aniosFCPFActionPerformed

    private void aniosFEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosFEPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniosFEPFActionPerformed

    private void ingresoNombrePRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoNombrePRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNombrePRActionPerformed

    private void ingresoPrecioPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPrecioPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoPrecioPRActionPerformed

    private void volverAlMenuAnteriorPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuAnteriorPRActionPerformed
           Principal.removeAll();
           Principal.add(menu);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_volverAlMenuAnteriorPRActionPerformed

    private void aniosFCPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosFCPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniosFCPRActionPerformed

    private void ingresoNombrePCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoNombrePCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNombrePCActionPerformed

    private void ingresoPrecioPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPrecioPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoPrecioPCActionPerformed

    private void volverAlMenuAnteriorPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuAnteriorPCActionPerformed
           Principal.removeAll();
           Principal.add(menu);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_volverAlMenuAnteriorPCActionPerformed

    private void aniosFCPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosFCPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniosFCPCActionPerformed

    private void bVMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVMAActionPerformed
           Principal.removeAll();
           Principal.add(mPrincipal);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_bVMAActionPerformed

    private void cargarMCPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarMCPRActionPerformed
           Date f = new Date();
           ProductoRefrigerado pr = new ProductoRefrigerado();
           int varAux=0;
       pr.setNombre(ingresoNombrePR.getText());
       try{
           pr.setPrecio(Integer. parseInt (ingresoPrecioPR.getText()));
       }catch(NumberFormatException e){
           varAux = -1;
           JOptionPane.showMessageDialog(this, "Error al ingresar valor: precio. Solo se permiten numeros");
       }
       try{
           pr.setNumeroDeLote(Integer. parseInt (ingresoNroLotePR.getText()));
       }catch(NumberFormatException e){
           varAux = -1;
           JOptionPane.showMessageDialog(this, "Error al ingresar numero de lote. Solo se permiten numeros");
       }
       pr.setDescripcion(ingresoDescPR.getText());
       try{
           f.setYear(Integer. parseInt ((String) aniosFCPR.getSelectedItem()));
           f.setMonth(Integer. parseInt ((String) mesesFCPR.getSelectedItem()));
           f.setDate(Integer. parseInt ((String) diasFCPR.getSelectedItem()));
       }catch(NumberFormatException e){
            varAux = -1;
            JOptionPane.showMessageDialog(this, "Error al ingresar fecha. Solo se permiten numeros");

       }
       pr.setFechaDeCaducidad(f);
       pr.setCodigoDeSupervicionAlimentaria(ingresoCOPR.getText());
       if(varAux != -1){
           lista.add(new ProductoRefrigerado(pr.getNombre(),pr.getDescripcion(),pr.getFechaDeCaducidad(),pr.getNumeroDeLote(),pr.getPrecio(),pr.getCodigoDeSupervicionAlimentaria()));
           listaP.add(new ProductoRefrigerado(pr.getNombre(),pr.getDescripcion(),pr.getFechaDeCaducidad(),pr.getNumeroDeLote(),pr.getPrecio(),pr.getCodigoDeSupervicionAlimentaria()));
           guardarArch();
           Principal.removeAll();
           Principal.add(menu);
           Principal.repaint();
           Principal.revalidate();
       }
    }//GEN-LAST:event_cargarMCPRActionPerformed

    private void cargarMCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarMCPFActionPerformed
           Date f = new Date();
           Date f1 = new Date();
           ProductoFresco pf = new ProductoFresco();
           int varAux = 0;
        pf.setNombre(ingresoNombrePF.getText());
        try{
            pf.setPrecio(Integer. parseInt (ingresoPrecioPF.getText()));
        }catch(NumberFormatException e){
            varAux = -1;
            JOptionPane.showMessageDialog(this, "Error al ingresar valor: precio. Solo se permiten numeros");
        }
        try{
            pf.setNumeroDeLote(Integer. parseInt (ingresoNroLotePF.getText()));
        }catch(NumberFormatException e){
            varAux = -1;
            JOptionPane.showMessageDialog(this, "Error al ingresar numero de lote. Solo se permiten numeros");
        }
        pf.setDescripcion(ingresoDescPF.getText());
        try{
            f.setYear(Integer. parseInt ((String) aniosFCPF.getSelectedItem()));
            f.setMonth(Integer. parseInt ((String) mesesFCPF.getSelectedItem()));
            f.setDate(Integer. parseInt ((String) diasFCPF.getSelectedItem()));
        }catch(NumberFormatException e){
            varAux = -1;
            JOptionPane.showMessageDialog(this, "Error al ingresar fecha. Solo se permiten numeros");
        }
        pf.setFechaDeCaducidad(f);
        try {
           f1.setYear(Integer.parseInt((String) aniosFEPF.getSelectedItem()));
           f1.setMonth(Integer.parseInt((String) mesesFEPF.getSelectedItem()));
           f1.setDate(Integer.parseInt((String) diasFEPF.getSelectedItem()));
        }catch(NumberFormatException e) {
           varAux = -1;
           JOptionPane.showMessageDialog(this, "Error al ingresar fecha. Solo se permiten numeros");
        }
        pf.setFechaDeEnvasado(f1);
        pf.setPaisDeOrigen(ingresoPaisOPF.getText());
        if(varAux != -1){
            lista.add(new ProductoFresco(pf.getNombre(),pf.getDescripcion(),pf.getFechaDeCaducidad(),pf.getNumeroDeLote(),pf.getPrecio(),pf.getFechaDeEnvasado(),pf.getPaisDeOrigen()));
            listaP.add(new ProductoFresco(pf.getNombre(),pf.getDescripcion(),pf.getFechaDeCaducidad(),pf.getNumeroDeLote(),pf.getPrecio(),pf.getFechaDeEnvasado(),pf.getPaisDeOrigen()));
            guardarArch();
            Principal.removeAll();
            Principal.add(menu);
            Principal.repaint();
            Principal.revalidate();
        }
    }//GEN-LAST:event_cargarMCPFActionPerformed

    private void cargarMCPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarMCPCActionPerformed
           Date f = new Date();
           ProductoCongelado pc = new ProductoCongelado();
           int varAux = 0;
           pc.setNombre(ingresoNombrePC.getText());
           try{
               pc.setPrecio(Integer. parseInt (ingresoPrecioPC.getText()));
           }catch(NumberFormatException e){
               varAux = -1;
               JOptionPane.showMessageDialog(this, "Error al ingresar valor: precio. Solo se permiten numeros");
           }
           try{
               pc.setNumeroDeLote(Integer. parseInt (ingresoNroLotePC.getText()));
           }catch(NumberFormatException e){
               varAux = -1;
               JOptionPane.showMessageDialog(this, "Error al ingresar valor: numero de lote. Solo se permiten numeros");
           }
           pc.setDescripcion(ingresoDescPC.getText());
           try{
               f.setYear(Integer. parseInt ((String) aniosFCPC.getSelectedItem()));
               f.setMonth(Integer. parseInt ((String) mesesFCPC.getSelectedItem()));
               f.setDate(Integer. parseInt ((String) diasFCPC.getSelectedItem()));
           }catch (NumberFormatException e){
               varAux = -1;
               JOptionPane.showMessageDialog(this, "Error al ingresar valor: fecha. Solo se permiten numeros");
           }
           pc.setFechaDeCaducidad(f);
           try{
               pc.setTemperaturaDeCongelacionRecomendada(Float. parseFloat (ingresoTempPC.getText()));
           }catch (NumberFormatException e){
               varAux = -1;
               JOptionPane.showMessageDialog(this, "Error al ingresar valor: temperatura de congelacion recomendada. Solo se permiten numeros");
           }
           if(varAux != -1){
               lista.add(new ProductoCongelado(pc.getNombre(),pc.getDescripcion(),pc.getFechaDeCaducidad(),pc.getNumeroDeLote(),pc.getPrecio(),pc.getTemperaturaDeCongelacionRecomendada()));
               listaP.add(new ProductoCongelado(pc.getNombre(),pc.getDescripcion(),pc.getFechaDeCaducidad(),pc.getNumeroDeLote(),pc.getPrecio(),pc.getTemperaturaDeCongelacionRecomendada()));
               guardarArch();
               Principal.removeAll();
               Principal.add(menu);
               Principal.repaint();
               Principal.revalidate();
           }
    }//GEN-LAST:event_cargarMCPCActionPerformed

    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
           Principal.removeAll();
           Principal.add(mListadoDeProductos);
           Principal.repaint();
           Principal.revalidate();
           mostrar(ingresoTablaLP,1);
    }//GEN-LAST:event_listaProductosActionPerformed

    private void vamaLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vamaLPActionPerformed
           Principal.removeAll();
           Principal.add(menu);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_vamaLPActionPerformed

    private void volverAlMenuAnteriorPF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuAnteriorPF3ActionPerformed
           Principal.removeAll();
           Principal.add(mListadoDeProductos);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_volverAlMenuAnteriorPF3ActionPerformed

    private void aniosMFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosMFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniosMFCActionPerformed

    private void aniosMFEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosMFEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniosMFEActionPerformed

    private void bGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarCambiosActionPerformed
        ProductoFresco pf = new ProductoFresco();
        ProductoRefrigerado pr = new ProductoRefrigerado();
        ProductoCongelado pc = new ProductoCongelado();
        Date f = new Date();
        Date f1 = new Date();
        int inte; 
        int varAux = 0;
            if(producto==0){
                pf.setNombre(ingresoModNom.getText());
                try{
                    pf.setPrecio(Integer. parseInt (ingresoModPre.getText()));
                }catch(NumberFormatException e){
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: precio. Solo se permiten numeros");
                }
                pf.setPaisDeOrigen(ingresoModPO.getText());
                try{
                    pf.setNumeroDeLote(Integer. parseInt (ingresoModNroLote.getText()));
                }catch(NumberFormatException e){
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: numero de lote. Solo se permiten numeros");
                }
                pf.setDescripcion(ingresoDeMP.getText());
                try{
                    f.setYear(Integer. parseInt ((String) aniosMFC.getSelectedItem()));
                    f.setMonth(Integer. parseInt ((String) mesesMFC.getSelectedItem()));
                    f.setDate(Integer. parseInt ((String) diasMFC.getSelectedItem()));
                }catch(NumberFormatException e){
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: fecha. Solo se permiten numeros");
                }
                pf.setFechaDeCaducidad(f);
                try{
                    f1.setYear(Integer. parseInt ((String) aniosMFE.getSelectedItem()));
                    f1.setMonth(Integer. parseInt ((String) mesesMFE.getSelectedItem()));
                    f1.setDate(Integer. parseInt ((String) diasMFE.getSelectedItem()));
                }catch(NumberFormatException e){
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: fecha. Solo se permiten numeros");
                }
                pf.setFechaDeEnvasado(f1);
                if(varAux == -1){
                     for(inte = 0; inte<listaP.size(); inte++){
                        if(listaP.get(inte).getNombre().equals(lista.get(ordenar).getNombre())){
                            listaP.set(inte, new ProductoFresco(pf.getNombre(),pf.getDescripcion(),pf.getFechaDeCaducidad(),pf.getNumeroDeLote(),pf.getPrecio(),pf.getFechaDeEnvasado(),pf.getPaisDeOrigen()));
                            break;
                        }
                    }
                    lista.set(ordenar, new ProductoFresco(pf.getNombre(),pf.getDescripcion(),pf.getFechaDeCaducidad(),pf.getNumeroDeLote(),pf.getPrecio(),pf.getFechaDeEnvasado(),pf.getPaisDeOrigen()));
                    guardarArch();
                    JOptionPane.showMessageDialog(this, "Se ha modificado el producto con exito");
                }
        }
        if(producto==1){
                pr.setNombre(ingresoModNom.getText());
                try{
                    pr.setPrecio(Integer. parseInt (ingresoModPre.getText()));
                }catch(NumberFormatException e){
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: precio. Solo se permiten numeros");
                }
                try{
                    pr.setNumeroDeLote(Integer. parseInt (ingresoModNroLote.getText()));
                }catch (NumberFormatException e) {
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: numero de lote. Solo se permiten numeros");
                }
                pr.setDescripcion(ingresoDeMP.getText());
                pr.setCodigoDeSupervicionAlimentaria(ingresoModPO.getText());
                try{
                    f.setYear(Integer. parseInt ((String) aniosMFC.getSelectedItem()));
                    f.setMonth(Integer. parseInt ((String) mesesMFC.getSelectedItem()));
                    f.setDate(Integer. parseInt ((String) diasMFC.getSelectedItem()));
                }catch(NumberFormatException e){
                    varAux = -1;
                    JOptionPane.showMessageDialog(this, "Error al ingresar valor: fecha. Solo se permiten numeros");
                }
                pr.setFechaDeCaducidad(f);
                if(varAux != -1) {
                    for(inte = 0; inte<listaP.size(); inte++){
                        if(listaP.get(inte).getNombre().equals(lista.get(ordenar).getNombre())){
                            listaP.set(inte, new ProductoRefrigerado(pr.getNombre(),pr.getDescripcion(),pr.getFechaDeCaducidad(),pr.getNumeroDeLote(),pr.getPrecio(),pr.getCodigoDeSupervicionAlimentaria()));
                            break;
                        }
                    }
                    lista.set(ordenar, new ProductoRefrigerado(pr.getNombre(),pr.getDescripcion(),pr.getFechaDeCaducidad(),pr.getNumeroDeLote(),pr.getPrecio(),pr.getCodigoDeSupervicionAlimentaria()));
                    guardarArch();
                    JOptionPane.showMessageDialog(this, "Se ha modificado el producto con exito");
                }
            
            
        }
        if(producto==2) {
               pc.setNombre(ingresoModNom.getText());
               try {
                   pc.setPrecio(Integer.parseInt(ingresoModPre.getText()));
               } catch (NumberFormatException e) {
                   varAux = -1;
                   JOptionPane.showMessageDialog(this, "Error al ingresar valor: precio. Solo se permiten numeros");
               }
               try {
                   pc.setNumeroDeLote(Integer.parseInt(ingresoModNroLote.getText()));
               } catch (NumberFormatException e) {
                   varAux = -1;
                   JOptionPane.showMessageDialog(this, "Error al ingresar valor: numero de lote. Solo se permiten numeros");
               }
               pc.setDescripcion(ingresoDeMP.getText());
               try{
                   pc.setTemperaturaDeCongelacionRecomendada(Float.parseFloat(ingresoModPO.getText()));
               }catch (NumberFormatException e){
                   varAux = -1;
                   JOptionPane.showMessageDialog(this, "Error al ingresar valor: temperatura de congelacion recomendada. Solo se permiten numeros");
               }
               try {
                   f.setYear(Integer.parseInt((String) aniosMFC.getSelectedItem()));
                   f.setMonth(Integer.parseInt((String) mesesMFC.getSelectedItem()));
                   f.setDate(Integer.parseInt((String) diasMFC.getSelectedItem()));
               } catch (NumberFormatException e) {
                   varAux = -1;
                   JOptionPane.showMessageDialog(this, "Error al ingresar valor: fecha. Solo se permiten numeros");
               }
               pc.setFechaDeCaducidad(f);
               if (varAux != -1) {
                   for(inte = 0; inte<listaP.size(); inte++){
                        if(listaP.get(inte).getNombre().equals(lista.get(ordenar).getNombre())){    
                            listaP.set(inte, new ProductoCongelado(pc.getNombre(),pc.getDescripcion(),pc.getFechaDeCaducidad(),pc.getNumeroDeLote(),pc.getPrecio(),pc.getTemperaturaDeCongelacionRecomendada()));
                            break;
                        }
                    lista.set(ordenar, new ProductoCongelado(pc.getNombre(),pc.getDescripcion(),pc.getFechaDeCaducidad(),pc.getNumeroDeLote(),pc.getPrecio(),pc.getTemperaturaDeCongelacionRecomendada()));
                    guardarArch();
                    JOptionPane.showMessageDialog(this, "Se ha modificado el producto con exito");
               }
           }   
       }
       mostrar(ingresoTablaLP,1);
    }//GEN-LAST:event_bGuardarCambiosActionPerformed

    private void volverAlMenuAnteriorPF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuAnteriorPF4ActionPerformed
           Principal.removeAll();
           Principal.add(mListadoDeProductos);
           Principal.repaint();
           Principal.revalidate();
    }//GEN-LAST:event_volverAlMenuAnteriorPF4ActionPerformed

    private void bEliminarPermanenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarPermanenteActionPerformed
          int inte;
          for(inte = 0; inte<listaP.size(); inte++){
              if(listaP.get(inte).getNombre().equals(lista.get(ordenar).getNombre())){
                  listaP.remove(inte);
                  break;
              }
          }
          lista.remove(ordenar);
          guardarArch();
          mostrar(ingresoTablaLP,1);
          Principal.removeAll();
          Principal.add(mListadoDeProductos);
          Principal.repaint();
          Principal.revalidate();
    }//GEN-LAST:event_bEliminarPermanenteActionPerformed

    private void textoMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMenuProductoActionPerformed
          Principal.removeAll();
          Principal.add(menu);
          Principal.repaint();
          Principal.revalidate();
    }//GEN-LAST:event_textoMenuProductoActionPerformed

    private void textoMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMenuClienteActionPerformed
          Principal.removeAll();
          Principal.add(mEnProceso);
          Principal.repaint();
          Principal.revalidate();
    }//GEN-LAST:event_textoMenuClienteActionPerformed

    private void textoMenuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMenuPedidoActionPerformed
          Principal.removeAll();
          Principal.add(mEnProceso);
          Principal.repaint();
          Principal.revalidate();
    }//GEN-LAST:event_textoMenuPedidoActionPerformed

    private void volverAlMenuAnteriorMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuAnteriorMPActionPerformed
          Principal.removeAll();
          Principal.add(mPrincipal);
          Principal.repaint();
          Principal.revalidate();
    }//GEN-LAST:event_volverAlMenuAnteriorMPActionPerformed

    private void vamaLP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vamaLP1ActionPerformed
          Principal.removeAll();
          Principal.add(menu);
          Principal.repaint();
          Principal.revalidate();
    }//GEN-LAST:event_vamaLP1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
            System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ingresoPaisOPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPaisOPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoPaisOPFActionPerformed

    private void eliminarLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLPActionPerformed
        ProductoFresco pf;
        ProductoRefrigerado pr;
        ProductoCongelado pc;
        int i;
        int elementos;
        int variable = -1;
        for(elementos = 0; elementos<lista.size();elementos++){
            if(ingresoTablaLP.isCellSelected(elementos,0) || ingresoTablaLP.isCellSelected(elementos,1)){
                variable = elementos;
                break;
            }
        }
        if(variable != -1){
            //PRODUCTOS FRESCOS
            for(i = 0; i<lista.size();i++){
                if(ingresoTablaLP.getValueAt(variable,0).equals(lista.get(i).getNombre())){
                    if(lista.get(i) instanceof ProductoFresco){
                        pf = (ProductoFresco) lista.get(i);
                        ordenar = i;
                        mEliminar.add(bEliminarPermanente);
                        mEliminar.add(textoMPPF);
                        mEliminar.add(txtFEAnio);
                        mEliminar.add(txtFEMes);
                        mEliminar.add(txtFEDia);
                        mEliminar.add(fechEMPPF1);
                        mEliminar.add(txtPO);
                        mEliminar.add(textoAnioMP1);
                        mEliminar.add(textoMesMP1);
                        mEliminar.add(textoDiaMP1);
                        txtNombre.setText(pf.getNombre());
                        txtPrecio.setText(Integer.toString(pf.getPrecio()));
                        txtNroLote.setText(Integer.toString(pf.getNumeroDeLote()));
                        txtPO.setText(pf.getPaisDeOrigen());
                        txtDescripcion.setText(pf.getDescripcion());
                        txtFCAnio.setText(Integer.toString(pf.getFechaDeCaducidad().getYear()));
                        txtFCMes.setText(Integer.toString(pf.getFechaDeCaducidad().getMonth()));
                        txtFCDia.setText(Integer.toString(pf.getFechaDeCaducidad().getDate()));
                        txtFEAnio.setText(Integer.toString(pf.getFechaDeEnvasado().getYear()));
                        txtFEMes.setText(Integer.toString(pf.getFechaDeEnvasado().getMonth()));
                        txtFEDia.setText(Integer.toString(pf.getFechaDeEnvasado().getDate()));
                        mEliminar.remove(textoMPPR);
                        mEliminar.remove(textoMPPC);
                        mEliminar.remove(textoTC);
                        mEliminar.remove(textoCO);
                        mEliminar.remove(txtTC);
                        mEliminar.remove(txtCO);
                        producto = 0;
                        Principal.removeAll();
                        Principal.add(mEliminar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }

                    //PRODUCTOS REFRIGERADOS
                    if(lista.get(i) instanceof ProductoRefrigerado){
                        pr = (ProductoRefrigerado) lista.get(i);
                        ordenar = i;
                        mEliminar.add(bEliminarPermanente);
                        mEliminar.add(textoMPPR);
                        mEliminar.add(textoCO);
                        mEliminar.add(txtCO);
                        txtNombre.setText(pr.getNombre());
                        txtPrecio.setText(Integer.toString(pr.getPrecio()));
                        txtNroLote.setText(Integer.toString(pr.getNumeroDeLote()));
                        txtCO.setText(pr.getCodigoDeSupervicionAlimentaria());
                        txtDescripcion.setText(pr.getDescripcion());
                        txtFCAnio.setText(Integer.toString(pr.getFechaDeCaducidad().getYear()));
                        txtFCMes.setText(Integer.toString(pr.getFechaDeCaducidad().getMonth()));
                        txtFCDia.setText(Integer.toString(pr.getFechaDeCaducidad().getDate()));
                        mEliminar.remove(textoMPPF1);
                        mEliminar.remove(textoMPPF);
                        mEliminar.remove(textoMPPC);
                        mEliminar.remove(textoTC);
                        mEliminar.remove(txtTC);
                        mEliminar.remove(paisOMPPF1);
                        mEliminar.remove(txtPO);
                        mEliminar.remove(txtFEAnio);
                        mEliminar.remove(txtFEMes);
                        mEliminar.remove(txtFEDia);
                        mEliminar.remove(fechEMPPF1);
                        mEliminar.remove(textoAnioMP1);
                        mEliminar.remove(textoMesMP1);
                        mEliminar.remove(textoDiaMP1);
                        producto = 1;
                        Principal.removeAll();
                        Principal.add(mEliminar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }

                    //PRODUCTOS CONGELADOS
                    if(lista.get(i) instanceof ProductoCongelado){
                        pc = (ProductoCongelado) lista.get(i);
                        ordenar = i;
                        mEliminar.add(bEliminarPermanente);
                        mEliminar.add(textoMPPC);
                        mEliminar.add(textoTC);
                        mEliminar.add(txtTC);
                        txtNombre.setText(pc.getNombre());
                        txtPrecio.setText(Integer.toString(pc.getPrecio()));
                        txtNroLote.setText(Integer.toString(pc.getNumeroDeLote()));
                        txtTC.setText(Float.toString(pc.getTemperaturaDeCongelacionRecomendada()));
                        txtDescripcion.setText(pc.getDescripcion());
                        txtFCAnio.setText(Integer.toString(pc.getFechaDeCaducidad().getYear()));
                        txtFCMes.setText(Integer.toString(pc.getFechaDeCaducidad().getMonth()));
                        txtFCDia.setText(Integer.toString(pc.getFechaDeCaducidad().getDate()));
                        mEliminar.remove(textoMPPF1);
                        mEliminar.remove(textoMPPF);
                        mEliminar.remove(textoMPPR);
                        mEliminar.remove(textoCO);
                        mEliminar.remove(txtCO);
                        mEliminar.remove(paisOMPPF1);
                        mEliminar.remove(txtPO);
                        mEliminar.remove(txtFEAnio);
                        mEliminar.remove(txtFEMes);
                        mEliminar.remove(txtFEDia);
                        mEliminar.remove(fechEMPPF1);
                        mEliminar.remove(textoAnioMP1);
                        mEliminar.remove(textoMesMP1);
                        mEliminar.remove(textoDiaMP1);
                        producto = 2;
                        Principal.removeAll();
                        Principal.add(mEliminar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarLPActionPerformed

    private void modificarLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarLPActionPerformed
        ProductoFresco pf;
        ProductoRefrigerado pr;
        ProductoCongelado pc;
        int i;
        int elementos;
        int variable = -1;
        for(elementos = 0; elementos<lista.size();elementos++){
            if(ingresoTablaLP.isCellSelected(elementos,0) || ingresoTablaLP.isCellSelected(elementos,1)){
                variable = elementos;
                break;
            }
        }
        if(variable != -1){
            for(i = 0; i<lista.size();i++){
                if(ingresoTablaLP.getValueAt(variable,0).equals(lista.get(i).getNombre())){
                    
                    //PRODUCTOS FRESCOS
                    if((lista.get(i).getClass() == ProductoFresco.class)){
                        pf = (ProductoFresco) lista.get(i);
                        ordenar = i;
                        mModificar.add(textoMPPF);
                        mModificar.add(aniosMFE);
                        mModificar.add(mesesMFE);
                        mModificar.add(diasMFE);
                        mModificar.add(fechEMPPF);
                        mModificar.add(paisOMPPF);
                        mModificar.add(textoAnioMP3);
                        mModificar.add(textoMesMP3);
                        mModificar.add(textoDiaMP3);
                        ingresoModNom.setText(pf.getNombre());
                        ingresoModPre.setText(Integer.toString(pf.getPrecio()));
                        ingresoModNroLote.setText(Integer.toString(pf.getNumeroDeLote()));
                        ingresoModPO.setText(pf.getPaisDeOrigen());
                        ingresoDeMP.setText(pf.getDescripcion());
                        aniosMFC.setSelectedItem(pf.getFechaDeCaducidad().getYear());
                        mesesMFC.setSelectedItem(pf.getFechaDeCaducidad().getMonth());
                        diasMFC.setSelectedItem(pf.getFechaDeCaducidad().getDate());
                        aniosMFE.setSelectedItem(pf.getFechaDeEnvasado().getYear());
                        mesesMFE.setSelectedItem(pf.getFechaDeEnvasado().getMonth());
                        diasMFE.setSelectedItem(pf.getFechaDeEnvasado().getDate());
                        mModificar.remove(textoMPPR);
                        mModificar.remove(textoMPPC);
                        mModificar.remove(textoTC1);
                        mModificar.remove(textoCO1);
                        producto = 0;
                        Principal.removeAll();
                        Principal.add(mModificar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }

                    //PRODUCTOS REFRIGERADOS
                    if(lista.get(i).getClass() == ProductoRefrigerado.class){
                        pr = (ProductoRefrigerado) lista.get(i);
                        ordenar = i;
                        mModificar.add(textoMPPR);
                        mModificar.add(textoCO1);
                        ingresoModNom.setText(pr.getNombre());
                        ingresoModPre.setText(Integer.toString(pr.getPrecio()));
                        ingresoModNroLote.setText(Integer.toString(pr.getNumeroDeLote()));
                        ingresoModPO.setText(pr.getCodigoDeSupervicionAlimentaria());
                        ingresoDeMP.setText(pr.getDescripcion());
                        aniosMFC.setSelectedItem(pr.getFechaDeCaducidad().getYear());
                        mesesMFC.setSelectedItem(pr.getFechaDeCaducidad().getMonth());
                        diasMFC.setSelectedItem(pr.getFechaDeCaducidad().getDate());
                        mModificar.remove(textoMPPF);
                        mModificar.remove(textoMPPC);
                        mModificar.remove(textoTC1);
                        mModificar.remove(aniosMFE);
                        mModificar.remove(mesesMFE);
                        mModificar.remove(diasMFE);
                        mModificar.remove(fechEMPPF);
                        mModificar.remove(paisOMPPF);
                        mModificar.remove(fechEMPPF1);
                        mModificar.remove(textoAnioMP3);
                        mModificar.remove(textoMesMP3);
                        mModificar.remove(textoDiaMP3);
                        producto = 1;
                        Principal.removeAll();
                        Principal.add(mModificar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }

                    //PRODUCTOS CONGELADOS
                    if(lista.get(i).getClass() == ProductoCongelado.class){
                        pc = (ProductoCongelado) lista.get(i);
                        ordenar = i;
                        mModificar.add(textoMPPC);
                        mModificar.add(textoTC1);
                        ingresoModNom.setText(pc.getNombre());
                        ingresoModPre.setText(Integer.toString(pc.getPrecio()));
                        ingresoModNroLote.setText(Integer.toString(pc.getNumeroDeLote()));
                        ingresoModPO.setText(Float.toString(pc.getTemperaturaDeCongelacionRecomendada()));
                        ingresoDeMP.setText(pc.getDescripcion());
                        aniosMFC.setSelectedItem(pc.getFechaDeCaducidad().getYear());
                        mesesMFC.setSelectedItem(pc.getFechaDeCaducidad().getMonth());
                        diasMFC.setSelectedItem(pc.getFechaDeCaducidad().getDate());
                        mModificar.remove(textoMPPF);
                        mModificar.remove(textoMPPR);
                        mModificar.remove(textoCO1);
                        mModificar.remove(aniosMFE);
                        mModificar.remove(mesesMFE);
                        mModificar.remove(diasMFE);
                        mModificar.remove(fechEMPPF);
                        mModificar.remove(paisOMPPF);
                        mModificar.remove(fechEMPPF1);
                        mModificar.remove(textoAnioMP3);
                        mModificar.remove(textoMesMP3);
                        mModificar.remove(textoDiaMP3);
                        producto = 2;
                        Principal.removeAll();
                        Principal.add(mModificar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_modificarLPActionPerformed

    private void consultarInfoLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarInfoLPActionPerformed
        ProductoFresco pf;
        ProductoRefrigerado pr;
        ProductoCongelado pc;
        int elementos;
        int variable = -1;
        int i;
        for(elementos = 0; elementos<lista.size();elementos++){
            if(ingresoTablaLP.isCellSelected(elementos,0) || ingresoTablaLP.isCellSelected(elementos,1)){
                variable = elementos;
                break;
            }
        }
        if(variable != -1){
            //PRODUCTOS FRESCOS
            for(i = 0; i<lista.size();i++){
                if(ingresoTablaLP.getValueAt(variable,0).equals(lista.get(i).getNombre())){
                    if(lista.get(i) instanceof ProductoFresco){
                        pf = (ProductoFresco) lista.get(i);
                        ordenar = i;
                        mEliminar.add(textoMPPF);
                        mEliminar.add(txtFEAnio);
                        mEliminar.add(txtFEMes);
                        mEliminar.add(txtFEDia);
                        mEliminar.add(fechEMPPF1);
                        mEliminar.add(txtPO);
                        mEliminar.add(textoAnioMP1);
                        mEliminar.add(textoMesMP1);
                        mEliminar.add(textoDiaMP1);
                        txtNombre.setText(pf.getNombre());
                        txtPrecio.setText(Integer.toString(pf.getPrecio()));
                        txtNroLote.setText(Integer.toString(pf.getNumeroDeLote()));
                        txtPO.setText(pf.getPaisDeOrigen());
                        txtDescripcion.setText(pf.getDescripcion());
                        txtFCAnio.setText(Integer.toString(pf.getFechaDeCaducidad().getYear()));
                        txtFCMes.setText(Integer.toString(pf.getFechaDeCaducidad().getMonth()));
                        txtFCDia.setText(Integer.toString(pf.getFechaDeCaducidad().getDate()));
                        txtFEAnio.setText(Integer.toString(pf.getFechaDeEnvasado().getYear()));
                        txtFEMes.setText(Integer.toString(pf.getFechaDeEnvasado().getMonth()));
                        txtFEDia.setText(Integer.toString(pf.getFechaDeEnvasado().getDate()));
                        mEliminar.remove(bEliminarPermanente);
                        mEliminar.remove(textoMPPR);
                        mEliminar.remove(textoMPPC);
                        mEliminar.remove(textoTC);
                        mEliminar.remove(textoCO);
                        mEliminar.remove(txtTC);
                        mEliminar.remove(txtCO);
                        producto = 0;
                        Principal.removeAll();
                        Principal.add(mEliminar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }

                    //PRODUCTOS REFRIGERADOS
                    if(lista.get(i) instanceof ProductoRefrigerado){
                        pr = (ProductoRefrigerado) lista.get(i);
                        ordenar = i;
                        mEliminar.add(textoMPPR);
                        mEliminar.add(textoCO);
                        mEliminar.add(txtCO);
                        txtNombre.setText(pr.getNombre());
                        txtPrecio.setText(Integer.toString(pr.getPrecio()));
                        txtNroLote.setText(Integer.toString(pr.getNumeroDeLote()));
                        txtCO.setText(pr.getCodigoDeSupervicionAlimentaria());
                        txtDescripcion.setText(pr.getDescripcion());
                        txtFCAnio.setText(Integer.toString(pr.getFechaDeCaducidad().getYear()));
                        txtFCMes.setText(Integer.toString(pr.getFechaDeCaducidad().getMonth()));
                        txtFCDia.setText(Integer.toString(pr.getFechaDeCaducidad().getDate()));
                        mEliminar.remove(textoMPPF1);
                        mEliminar.remove(bEliminarPermanente);
                        mEliminar.remove(textoMPPF);
                        mEliminar.remove(textoMPPC);
                        mEliminar.remove(textoTC);
                        mEliminar.remove(txtTC);
                        mEliminar.remove(paisOMPPF1);
                        mEliminar.remove(txtPO);
                        mEliminar.remove(txtFEAnio);
                        mEliminar.remove(txtFEMes);
                        mEliminar.remove(txtFEDia);
                        mEliminar.remove(fechEMPPF1);
                        mEliminar.remove(textoAnioMP1);
                        mEliminar.remove(textoMesMP1);
                        mEliminar.remove(textoDiaMP1);
                        producto = 1;
                        Principal.removeAll();
                        Principal.add(mEliminar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }

                    //PRODUCTOS CONGELADOS
                    if(lista.get(i) instanceof ProductoCongelado){
                        pc = (ProductoCongelado) lista.get(i);
                        ordenar = i;
                        mEliminar.add(textoMPPC);
                        mEliminar.add(textoTC);
                        mEliminar.add(txtTC);
                        txtNombre.setText(pc.getNombre());
                        txtPrecio.setText(Integer.toString(pc.getPrecio()));
                        txtNroLote.setText(Integer.toString(pc.getNumeroDeLote()));
                        txtTC.setText(Float.toString(pc.getTemperaturaDeCongelacionRecomendada()));
                        txtDescripcion.setText(pc.getDescripcion());
                        txtFCAnio.setText(Integer.toString(pc.getFechaDeCaducidad().getYear()));
                        txtFCMes.setText(Integer.toString(pc.getFechaDeCaducidad().getMonth()));
                        txtFCDia.setText(Integer.toString(pc.getFechaDeCaducidad().getDate()));
                        mEliminar.remove(textoMPPF1);
                        mEliminar.remove(bEliminarPermanente);
                        mEliminar.remove(textoMPPF);
                        mEliminar.remove(textoMPPR);
                        mEliminar.remove(textoCO);
                        mEliminar.remove(txtCO);
                        mEliminar.remove(paisOMPPF1);
                        mEliminar.remove(txtPO);
                        mEliminar.remove(txtFEAnio);
                        mEliminar.remove(txtFEMes);
                        mEliminar.remove(txtFEDia);
                        mEliminar.remove(fechEMPPF1);
                        mEliminar.remove(textoAnioMP1);
                        mEliminar.remove(textoMesMP1);
                        mEliminar.remove(textoDiaMP1);
                        producto = 2;
                        Principal.removeAll();
                        Principal.add(mEliminar);
                        Principal.repaint();
                        Principal.revalidate();
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_consultarInfoLPActionPerformed
        
    public void mostrar(JTable t, int valor){
        Object [][] matris;
        if(valor == 1){
            matris = new Object[lista.size()][2];
        }else
        {
            matris = new Object[listaP.size()][2];
        }
        int columna;
        if(valor == 1){
            for(columna = 0; columna<lista.size(); columna++ ){
                matris[columna][0] = lista.get(columna).getNombre();
                matris[columna][1] = clase(lista.get(columna));
            }
        }
        if(valor == 2){
            for(columna = 0; columna<listaP.size(); columna++ ){
                matris[columna][0] = listaP.get(columna).getNombre();
                matris[columna][1] = clase(listaP.get(columna));
            }
        }
        
        t.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Nombre", "Tipo"
            }
            )
        ); 
        
        t.clearSelection();
        
    }
    
    public String clase(Object p){
        if(p.getClass() == ProductoFresco.class){return "Producto Fresco";}
        if(p.getClass() == ProductoRefrigerado.class){return "Producto Refrigerado";}
        if(p.getClass() == ProductoCongelado.class){return "Producto Congelado";}
        return null;
    }
    
    //ARCHIVOS
    public void guardarArch(){
        FileWriter guardar;
        BufferedWriter escritura;
        ProductoFresco pf;
        ProductoCongelado pc;
        ProductoRefrigerado pr;
        try{
            archivoLP.createNewFile();
        }catch(IOException ex){ex.printStackTrace();}
        int i;
        try{
            guardar=new FileWriter(archivoLP);
            escritura=new BufferedWriter(guardar);
            
            for(i=0;i<lista.size();i++){
                if(lista.get(i).getClass()==ProductoFresco.class){
                    escritura.write("Producto Fresco");
                    escritura.newLine();
                }
                if(lista.get(i).getClass()==ProductoRefrigerado.class){
                    escritura.write("Producto Refrigerado");
                    escritura.newLine();
                }
                if(lista.get(i).getClass()==ProductoCongelado.class){
                    escritura.write("Producto Congelado");
                    escritura.newLine();
                }
                escritura.write(lista.get(i).getNombre());
                escritura.newLine();
                escritura.write(Integer.toString(lista.get(i).getPrecio()));
                escritura.newLine(); 
                escritura.write(lista.get(i).getDescripcion());
                escritura.newLine(); 
                escritura.write(Integer.toString(lista.get(i).getNumeroDeLote()));
                escritura.newLine();
                escritura.write(Integer.toString(lista.get(i).getFechaDeCaducidad().getYear()));
                escritura.newLine();
                escritura.write(Integer.toString(lista.get(i).getFechaDeCaducidad().getMonth()));
                escritura.newLine();
                escritura.write(Integer.toString(lista.get(i).getFechaDeCaducidad().getDate()));
                escritura.newLine();
                if(lista.get(i).getClass()==ProductoFresco.class){
                    pf = (ProductoFresco) lista.get(i);
                    escritura.write(Integer.toString(pf.getFechaDeEnvasado().getYear()));
                    escritura.newLine();
                    escritura.write(Integer.toString(pf.getFechaDeEnvasado().getMonth()));
                    escritura.newLine();
                    escritura.write(Integer.toString(pf.getFechaDeEnvasado().getDate()));
                    escritura.newLine();
                    escritura.write(pf.getPaisDeOrigen());
                    escritura.newLine();
                }
                if(lista.get(i).getClass()==ProductoRefrigerado.class){
                    pr = (ProductoRefrigerado) lista.get(i);
                    escritura.write(pr.getCodigoDeSupervicionAlimentaria());
                    escritura.newLine();
                }
                if(lista.get(i).getClass()==ProductoCongelado.class){
                    pc = (ProductoCongelado) lista.get(i);
                    escritura.write(Float.toString(pc.getTemperaturaDeCongelacionRecomendada()));
                    escritura.newLine();
                }
            } 
            escritura.close();
        }catch(IOException e){System.out.println("No se encuentra el archivo para guardar los datos");}
    }
        
    public void leerArchivo() throws FileNotFoundException{
        FileReader leer;
        BufferedReader lectura;
        String q;
        ProductoFresco pf = new ProductoFresco();
        ProductoCongelado pc = new ProductoCongelado(); 
        ProductoRefrigerado pr = new ProductoRefrigerado();
        Date fc = new Date();
        Date fe = new Date();
        try{
            leer = new FileReader (archivoLP);
            lectura = new BufferedReader(leer);
                while((q = lectura.readLine()) != null){
                    if("Producto Fresco".equals(q)){
                        pf.setNombre(lectura.readLine());
                        pf.setPrecio(Integer.parseInt(lectura.readLine()));
                        pf.setDescripcion(lectura.readLine());
                        pf.setNumeroDeLote(Integer.parseInt(lectura.readLine()));
                        fc.setYear(Integer.parseInt(lectura.readLine()));
                        fc.setMonth(Integer.parseInt(lectura.readLine()));
                        fc.setDate(Integer.parseInt(lectura.readLine()));
                        pf.setFechaDeCaducidad(fc);
                        fe.setYear(Integer.parseInt(lectura.readLine()));
                        fe.setMonth(Integer.parseInt(lectura.readLine()));
                        fe.setDate(Integer.parseInt(lectura.readLine()));
                        pf.setFechaDeEnvasado(fe);
                        pf.setPaisDeOrigen(lectura.readLine());
                        lista.add(new ProductoFresco(pf.getNombre(),pf.getDescripcion(),pf.getFechaDeCaducidad(),pf.getNumeroDeLote(),pf.getPrecio(),pf.getFechaDeEnvasado(),pf.getPaisDeOrigen()));
                        listaP.add(new ProductoFresco(pf.getNombre(),pf.getDescripcion(),pf.getFechaDeCaducidad(),pf.getNumeroDeLote(),pf.getPrecio(),pf.getFechaDeEnvasado(),pf.getPaisDeOrigen()));
                    }
                    if("Producto Refrigerado".equals(q)){
                        pr.setNombre(lectura.readLine());
                        pr.setPrecio(Integer.parseInt(lectura.readLine()));
                        pr.setDescripcion(lectura.readLine());
                        pr.setNumeroDeLote(Integer.parseInt(lectura.readLine()));
                        fc.setYear(Integer.parseInt(lectura.readLine()));
                        fc.setMonth(Integer.parseInt(lectura.readLine()));
                        fc.setDate(Integer.parseInt(lectura.readLine()));
                        pr.setFechaDeCaducidad(fc);
                        pr.setCodigoDeSupervicionAlimentaria(lectura.readLine());
                        lista.add(new ProductoRefrigerado(pr.getNombre(),pr.getDescripcion(),pr.getFechaDeCaducidad(),pr.getNumeroDeLote(),pr.getPrecio(),pr.getCodigoDeSupervicionAlimentaria()));
                        listaP.add(new ProductoRefrigerado(pr.getNombre(),pr.getDescripcion(),pr.getFechaDeCaducidad(),pr.getNumeroDeLote(),pr.getPrecio(),pr.getCodigoDeSupervicionAlimentaria()));
                    }
                    if("Producto Congelado".equals(q)){
                        pc.setNombre(lectura.readLine());
                        pc.setPrecio(Integer.parseInt(lectura.readLine()));
                        pc.setDescripcion(lectura.readLine());
                        pc.setNumeroDeLote(Integer.parseInt(lectura.readLine()));
                        fc.setYear(Integer.parseInt(lectura.readLine()));
                        fc.setMonth(Integer.parseInt(lectura.readLine()));
                        fc.setDate(Integer.parseInt(lectura.readLine()));
                        pc.setFechaDeCaducidad(fc);
                        pc.setTemperaturaDeCongelacionRecomendada(Float.parseFloat(lectura.readLine()));
                        lista.add(new ProductoCongelado(pc.getNombre(),pc.getDescripcion(),pc.getFechaDeCaducidad(),pc.getNumeroDeLote(),pc.getPrecio(),pc.getTemperaturaDeCongelacionRecomendada()));
                        listaP.add(new ProductoCongelado(pc.getNombre(),pc.getDescripcion(),pc.getFechaDeCaducidad(),pc.getNumeroDeLote(),pc.getPrecio(),pc.getTemperaturaDeCongelacionRecomendada()));
                    }
                }
        }catch(IOException e){
            System.out.println("No se encuentra el archivo de los datos");
        }   
    }
    //ARCHIVOS
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new InterfazGrafica().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListaProductoOrdenado;
    private javax.swing.JLabel PrecioPC;
    private javax.swing.JLabel PrecioPF;
    private javax.swing.JLabel PrecioPR;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<String> aniosFCPC;
    private javax.swing.JComboBox<String> aniosFCPF;
    private javax.swing.JComboBox<String> aniosFCPR;
    private javax.swing.JComboBox<String> aniosFEPF;
    private javax.swing.JComboBox<String> aniosMFC;
    private javax.swing.JComboBox<String> aniosMFE;
    private javax.swing.JButton bEliminarPermanente;
    private javax.swing.JButton bGuardarCambios;
    private javax.swing.JButton bVMA;
    private javax.swing.JButton cargarMCPC;
    private javax.swing.JButton cargarMCPF;
    private javax.swing.JButton cargarMCPR;
    private javax.swing.JButton cargarPC;
    private javax.swing.JButton cargarPF;
    private javax.swing.JButton cargarPR;
    private javax.swing.JButton consultarInfoLP;
    private javax.swing.JLabel descripcionMPPF;
    private javax.swing.JLabel descripcionMPPF1;
    private javax.swing.JComboBox<String> diasFCPC;
    private javax.swing.JComboBox<String> diasFCPF;
    private javax.swing.JComboBox<String> diasFCPR;
    private javax.swing.JComboBox<String> diasFEPF;
    private javax.swing.JComboBox<String> diasMFC;
    private javax.swing.JComboBox<String> diasMFE;
    private javax.swing.JButton eliminarLP;
    private javax.swing.JLabel fechCMPPF;
    private javax.swing.JLabel fechCMPPF1;
    private javax.swing.JLabel fechEMPPF;
    private javax.swing.JLabel fechEMPPF1;
    private javax.swing.JTextField ingresoCOPR;
    private javax.swing.JScrollPane ingresoDMP;
    private javax.swing.JTextArea ingresoDeMP;
    private javax.swing.JTextArea ingresoDescPC;
    private javax.swing.JTextArea ingresoDescPF;
    private javax.swing.JTextArea ingresoDescPR;
    private javax.swing.JScrollPane ingresoDescripcionPC;
    private javax.swing.JScrollPane ingresoDescripcionPF;
    private javax.swing.JScrollPane ingresoDescripcionPR;
    private javax.swing.JScrollPane ingresoLP;
    private javax.swing.JTextField ingresoModNom;
    private javax.swing.JTextField ingresoModNroLote;
    private javax.swing.JTextField ingresoModPO;
    private javax.swing.JTextField ingresoModPre;
    private javax.swing.JTextField ingresoNombrePC;
    private javax.swing.JTextField ingresoNombrePF;
    private javax.swing.JTextField ingresoNombrePR;
    private javax.swing.JTextField ingresoNroLotePC;
    private javax.swing.JTextField ingresoNroLotePF;
    private javax.swing.JTextField ingresoNroLotePR;
    private javax.swing.JTextField ingresoPaisOPF;
    private javax.swing.JTextField ingresoPrecioPC;
    private javax.swing.JTextField ingresoPrecioPF;
    private javax.swing.JTextField ingresoPrecioPR;
    private javax.swing.JTable ingresoTablaLP;
    private javax.swing.JTextField ingresoTempPC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaProductos;
    private javax.swing.JPanel mCargarPC;
    private javax.swing.JPanel mCargarPF;
    private javax.swing.JPanel mCargarPR;
    private javax.swing.JPanel mEliminar;
    private javax.swing.JPanel mEnProceso;
    private javax.swing.JPanel mListadoDeProductos;
    private javax.swing.JPanel mModificar;
    private javax.swing.JPanel mPrincipal;
    private javax.swing.JPanel mProductosEnOrdenAlfabetico;
    private javax.swing.JPanel menu;
    private javax.swing.JComboBox<String> mesesFCPC;
    private javax.swing.JComboBox<String> mesesFCPF;
    private javax.swing.JComboBox<String> mesesFCPR;
    private javax.swing.JComboBox<String> mesesFEPF;
    private javax.swing.JComboBox<String> mesesMFC;
    private javax.swing.JComboBox<String> mesesMFE;
    private javax.swing.JButton modificarLP;
    private javax.swing.JLabel nombMPPF;
    private javax.swing.JLabel nombMPPF1;
    private javax.swing.JLabel paisOMPPF;
    private javax.swing.JLabel paisOMPPF1;
    private javax.swing.JLabel precioMPPF;
    private javax.swing.JLabel precioMPPF1;
    private javax.swing.JTable tablaPEOA;
    private javax.swing.JLabel textoAnioMP;
    private javax.swing.JLabel textoAnioMP1;
    private javax.swing.JLabel textoAnioMP2;
    private javax.swing.JLabel textoAnioMP3;
    private javax.swing.JLabel textoAnioPC;
    private javax.swing.JLabel textoAnioPF;
    private javax.swing.JLabel textoAnioPR;
    private javax.swing.JLabel textoCO;
    private javax.swing.JLabel textoCO1;
    private javax.swing.JLabel textoCOPR;
    private javax.swing.JLabel textoCargarPC;
    private javax.swing.JLabel textoCargarPF;
    private javax.swing.JLabel textoCargarPR;
    private javax.swing.JLabel textoDeProductos;
    private javax.swing.JLabel textoDescripcionPC;
    private javax.swing.JLabel textoDescripcionPF;
    private javax.swing.JLabel textoDescripcionPR;
    private javax.swing.JLabel textoDiaMP;
    private javax.swing.JLabel textoDiaMP1;
    private javax.swing.JLabel textoDiaMP2;
    private javax.swing.JLabel textoDiaMP3;
    private javax.swing.JLabel textoDiaPC;
    private javax.swing.JLabel textoDiaPF;
    private javax.swing.JLabel textoDiaPR;
    private javax.swing.JLabel textoFCPC;
    private javax.swing.JLabel textoFCPF;
    private javax.swing.JLabel textoFCPR;
    private javax.swing.JLabel textoFEPF;
    private javax.swing.JLabel textoListadoDeProductos;
    private javax.swing.JLabel textoListadoDeProductos1;
    private javax.swing.JLabel textoLotePC;
    private javax.swing.JLabel textoLotePF;
    private javax.swing.JLabel textoLotePR;
    private javax.swing.JLabel textoMP;
    private javax.swing.JLabel textoMP1;
    private javax.swing.JLabel textoMPPC;
    private javax.swing.JLabel textoMPPF;
    private javax.swing.JLabel textoMPPF1;
    private javax.swing.JLabel textoMPPR;
    private javax.swing.JLabel textoMenu;
    private javax.swing.JButton textoMenuCliente;
    private javax.swing.JButton textoMenuPedido;
    private javax.swing.JButton textoMenuProducto;
    private javax.swing.JLabel textoMesMP;
    private javax.swing.JLabel textoMesMP1;
    private javax.swing.JLabel textoMesMP2;
    private javax.swing.JLabel textoMesMP3;
    private javax.swing.JLabel textoMesPC;
    private javax.swing.JLabel textoMesPF;
    private javax.swing.JLabel textoMesPR;
    private javax.swing.JLabel textoNombrePC;
    private javax.swing.JLabel textoNombrePF;
    private javax.swing.JLabel textoNombrePR;
    private javax.swing.JLabel textoNroLote;
    private javax.swing.JLabel textoNroLote1;
    private javax.swing.JLabel textoPF;
    private javax.swing.JLabel textoPFPC;
    private javax.swing.JLabel textoPFPR;
    private javax.swing.JLabel textoPaisOPF;
    private javax.swing.JLabel textoTC;
    private javax.swing.JLabel textoTC1;
    private javax.swing.JLabel textoTempPC;
    private javax.swing.JLabel txtCO;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtFCAnio;
    private javax.swing.JLabel txtFCDia;
    private javax.swing.JLabel txtFCMes;
    private javax.swing.JLabel txtFEAnio;
    private javax.swing.JLabel txtFEDia;
    private javax.swing.JLabel txtFEMes;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNroLote;
    private javax.swing.JLabel txtPO;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTC;
    private javax.swing.JButton vamaLP;
    private javax.swing.JButton vamaLP1;
    private javax.swing.JButton volverAlMenuAnteriorMP;
    private javax.swing.JButton volverAlMenuAnteriorPC;
    private javax.swing.JButton volverAlMenuAnteriorPF;
    private javax.swing.JButton volverAlMenuAnteriorPF3;
    private javax.swing.JButton volverAlMenuAnteriorPF4;
    private javax.swing.JButton volverAlMenuAnteriorPR;
    // End of variables declaration//GEN-END:variables
}