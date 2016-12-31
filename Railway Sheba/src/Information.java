
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shahnawaz
 */
public class Information extends javax.swing.JFrame {

    /**
     * Creates new form Information
     */
    String get;

    DefaultComboBoxModel akh1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MAHANAGAR_PROVATI",
        "UPAKUL", "MAHANAGAR_GODHULI"});

    DefaultComboBoxModel bhrab1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_PROVATI",
        "PARABAT", "MAHANAGAR_GODHULI", "EGARO_SIDUR PROVAT", "UPABAN", "EGARO_SINDUR_GODHULI"});

    DefaultComboBoxModel bog = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "LALMONI", "RANGPUR-EXPRESS"});

    DefaultComboBoxModel bramon1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_PROVATI",
        "PARABAT", "UPAKUL", "JOYENTEEKA", "MAHANAGAR_GODHULI", "TURNA"});

    DefaultComboBoxModel comlai1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_PROVATI", "UPAKUL",
        "MAHANAGAR_GODHULI", "TURNA"});

    DefaultComboBoxModel chita1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "SUBARNA", "MAHANAGAR_PROVATI",
        "MAHANAGAR_GODHULI", "TURNA"});

    DefaultComboBoxModel dinaj1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "EKOTA", "DRUTAJAN"});

    DefaultComboBoxModel feni1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_PROVATI",
        "MAHANAGAR_GODHULI", "TURNA"});

    DefaultComboBoxModel gafar = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "TISTA", "AUGNIBINA",
        "BRAHMPUTRA", "JAMUNA", "HAOWR_EXPRESS"});

    DefaultComboBoxModel jessor1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel khul1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel mymen = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "TISTA", "AUGNIBINA",
        "BRAHMPUTRA", "JAMUNA", "HAOWR_EXPRESS"});

    DefaultComboBoxModel mirza1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "SILKCITY", "CHITRA"});

    DefaultComboBoxModel noa = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "UPAKUL"});

    DefaultComboBoxModel neel = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "NELSAGOR"});

    DefaultComboBoxModel nars1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MAHANAGAR_GODHULI",
        "EGARO_SINDUR PROVATI", "EGARO_SINDUR_GODHULI"});

    DefaultComboBoxModel rajsha1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY", "PADMA", "DHUMKETU_EXPRESS"});

    DefaultComboBoxModel rang = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RANGPUR_EXPRESS"});

    DefaultComboBoxModel sri1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTIKA",
        "UPABON", "KALNI_EXPRESS"});

    DefaultComboBoxModel siraj = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SIRAJGONG_EXPRESS"});

    DefaultComboBoxModel sarisha = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "AUGNIBINA", "JAMUNA"});

    DefaultComboBoxModel shaista1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT",
        "JOYENTIKA", "UPABON", "KALNI_EXPRESS"});

    DefaultComboBoxModel syl1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTIKA",
        "UPABON", "KALNI_EXPRESS"});

    DefaultComboBoxModel tang1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "EKOTA", "DRUTAJAN", "NELSAGORE",
        "SUNDARBAN", "LALMONI", "SILKCITY", "PADMA", "CHITRA", "DHUMKETO_EXPRESS", "SIRAJGONJ_EXPRESS"});

    DefaultComboBoxModel abdul = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRA", "TITUMEER", "SILKCITY", "PADMA",
        "SAGORDARI", "DHUMKETU_EXPRESS"});

    DefaultComboBoxModel bbsu = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY", "PADMA", "DHUMKETU_EXPRESS"});

    DefaultComboBoxModel chua = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SAGORDARI"});

    DefaultComboBoxModel dhaka1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY", "PADMA", "DHUMKETU_EXPRESS"});

    DefaultComboBoxModel dinaj = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRA"});

    DefaultComboBoxModel ishurdi = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "MODHUMOTI", "SAGORDARI"});

    DefaultComboBoxModel jessor2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SAGORDARI"});

    DefaultComboBoxModel joypur = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRO", "TITUMEER"});

    DefaultComboBoxModel khul2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SAGORDARI"});

    DefaultComboBoxModel kustia = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MODHUMOTI"});

    DefaultComboBoxModel mirja2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY"});

    DefaultComboBoxModel neelfa = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRO", "TITUMEER"});

    DefaultComboBoxModel nator = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRO", "TITUMEER"});

    DefaultComboBoxModel parba = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRO", "TITUMEER"});

    DefaultComboBoxModel pakshi = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MODHUMOTI"});

    DefaultComboBoxModel phul = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "BORENDRO", "TITUMEER"});

    DefaultComboBoxModel sharda = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PADMA"});

    DefaultComboBoxModel smon = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY", "PADMA", "DHUMKETU_EXPRESS"});

    DefaultComboBoxModel tang2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY", "PADMA"});

    DefaultComboBoxModel ulla = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SILKCITY", "PADMA"});

    DefaultComboBoxModel alam = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SUNDARBAN", "RUPSHA",
        "SAGORDARI", "CHITRA"});

    DefaultComboBoxModel abdul1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SAGORDARI"});

    DefaultComboBoxModel biram = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RUPSHA", "SEEMANTO"});

    DefaultComboBoxModel bbsw = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHITRA"});

    DefaultComboBoxModel boral = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel chua1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SUNDARBAN", "RUPSHA",
        "SEEMANTO", "SAGORDARI", "CHITRA"});

    DefaultComboBoxModel dhaka2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel dault = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN"});

    DefaultComboBoxModel ishur = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SUNDARBAN",
        "RUPSHA", "SEEMANTO", "SAGORDARI", "CHITRA"});

    DefaultComboBoxModel jessor3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SUNDARBAN",
        "RUPSHA", "SEEMANTO", "SAGORDARI", "CHITRA"});

    DefaultComboBoxModel joypur2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RUPSHA", "SEEMANTO"});

    DefaultComboBoxModel jaydeb = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel mirza3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel noapara1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SUNDARBAN",
        "SEEMANTO", "SAGORDARI", "CHITRA"});

    DefaultComboBoxModel nator1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RUPSHA", "SEEMANTO"});

    DefaultComboBoxModel parbati1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RUPSHA", "SEEMANTO"});

    DefaultComboBoxModel phul1 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RUPSHA", "SEEMANTO"});

    DefaultComboBoxModel rajsha2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "KOPOTAKKHO", "SAGORDARI"});

    DefaultComboBoxModel said = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "RUPSHA", "SEEMANTO"});

    DefaultComboBoxModel tang3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "SUNDARBAN", "CHITRA"});

    DefaultComboBoxModel akha2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel ashu = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "JOYENTEEKA"});

    DefaultComboBoxModel azam = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA"});

    DefaultComboBoxModel bharib2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "UPABAN"});

    DefaultComboBoxModel bramn = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA"});

    DefaultComboBoxModel bhan = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA"});

    DefaultComboBoxModel comila = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel chita = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel dhaka = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT",
        "JOYENTEEKA", "UPABAN", "KALNI_EXPRESS"});

    DefaultComboBoxModel biman = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT",
        "JOYENTEEKA", "UPABAN", "KALNI_EXPRESS"});

    DefaultComboBoxModel feni = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel horos = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "JOYENTEEKA", "PAHARIKA"});

    DefaultComboBoxModel kula = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA",
        "PAHARIKA", "UDAYAN", "UPABAN", "KALNI_EXPRESS"});

    DefaultComboBoxModel laksm = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel mukondo = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "JOYENTEEKA"});

    DefaultComboBoxModel maizgon = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA",
        "PAHARIKA", "UDAYAN", "UPABAN", "KALNI_EXPRESS"});

    DefaultComboBoxModel mantala = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "JOYENTEEKA"});

    DefaultComboBoxModel nangol = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "JOYENTEEKA"});

    DefaultComboBoxModel qosba = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA", "PAHARIKA"});

    DefaultComboBoxModel shazi = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA"});

    DefaultComboBoxModel srimongol3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA",
        "PAHARIKA", "UDAYAN", "UPABAN", "KALNI_EXPRESS"});

    DefaultComboBoxModel shaista3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PARABAT", "JOYENTEEKA",
        "PAHARIKA", "UDAYAN", "UPABAN", "KALNI_EXPRESS"});

    DefaultComboBoxModel shamser33 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN", "UPABAN"});

    DefaultComboBoxModel noa2 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "PARABAT", "JOYENTEEKA"});

    DefaultComboBoxModel akhu3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MAHANAGAR_GODHULI",
        "MAHANAGAR_PRAVATI", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel bharib3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_GODHULI",
        "MAHANAGAR_PRAVATI"});

    DefaultComboBoxModel bramon = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_GODHULI",
        "MAHANAGAR_PRAVATI", "TURNA"});

    DefaultComboBoxModel chand = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MEGHNA"});

    DefaultComboBoxModel chitos = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MEGHNA"});

    DefaultComboBoxModel comila3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA",
        "MAHANAGAR_GODHULI", "MAHANAGAR_PRAVATI", "PAHARIKA", "UDAYAN", "TURNA"});

    DefaultComboBoxModel court = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MEGHNA"});

    DefaultComboBoxModel dhaka3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_GODHULI",
        "MAHANAGAR_PRAVATI", "TURNA", "SUBARNA"});

    DefaultComboBoxModel biman3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_GODHULI",
        "MAHANAGAR_PRAVATI", "TURNA", "SUBARNA"});

    DefaultComboBoxModel feni3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "MAHANAGAR_GODHULI",
        "MAHANAGAR_PRAVATI", "PAHARIKA", "UDAYAN", "TURNA", "MEGHNA",});

    DefaultComboBoxModel hajigong = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MEGHNA"});

    DefaultComboBoxModel horos3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA"});

    DefaultComboBoxModel kula3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel laksm3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "CHATTALA", "PAHARIKA",
        "MAHANAGAR_PRAVATI", "UDAYAN", "MEGHNA", "TURNA"});

    DefaultComboBoxModel meher = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MEGHNA"});

    DefaultComboBoxModel maizgon3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel nangol3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "MEGHNA"});

    DefaultComboBoxModel nayapara = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA"});

    DefaultComboBoxModel narsing = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "MAHANAGAR-PRAVATI"});

    DefaultComboBoxModel qosba3 = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA"});

    DefaultComboBoxModel shemshr = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel shaista = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel srimong = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    DefaultComboBoxModel sylhet = new DefaultComboBoxModel(new String[]{"SELECT TRAIN", "PAHARIKA", "UDAYAN"});

    String pro1, pro2, pro3;
    static Connection con = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    // public DefaultTableModel DefaultTableModel;

    public Information() {
        initComponents();
        con = config.db_connect();
        JFrame frame = new JFrame();
        frame.pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 153, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 102), new java.awt.Color(102, 153, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(51, 51, 0)), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true)), "Use Your Brain , Look Out For A Train...", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Maiandra GD", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jTabbedPane1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane1KeyPressed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 102, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_4.jpg"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel16.setText("Name");

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel17.setText("Email Address");

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel18.setText("Phone Number");

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );

        jTabbedPane1.addTab("My Profile", jPanel5);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setText("Station From");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel4.setText("Station To");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel5.setText("Train Name");

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel6.setText("Class");

        jComboBox1.setBackground(new java.awt.Color(0, 153, 102));
        jComboBox1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "#-SELECT STATION-#", "DHAKA", "SYLHET", "RAJSHAHI", "CHITTAGONG", "KHULNA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(0, 153, 102));
        jComboBox2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(0, 153, 102));
        jComboBox3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", " " }));

        jComboBox4.setBackground(new java.awt.Color(0, 153, 102));
        jComboBox4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "#-SELECT CLASS-#", "SHOVON", "S_CHAIR", "F_SEAT", "SNIGDHA", " " }));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel7.setText("No of Passengers");

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N

        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jButton2.setText("CALCULATE FARE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 204, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel15.setText("QUERY RESULT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 261, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jComboBox3.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Fare Query", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel8.setText("Station From");

        jComboBox5.setBackground(new java.awt.Color(0, 102, 204));
        jComboBox5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "#-SELECT STATION-#", "DHAKA", "SYLHET", "RAJSHAHI", "CHITTAGONG", "KHULNA" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel9.setText("Station To");

        jComboBox6.setBackground(new java.awt.Color(0, 153, 255));
        jComboBox6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", " " }));

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel11.setText("SHOW DETAILS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );

        jTabbedPane1.addTab("Train Details", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SUBMIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirm Password");

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("New Password");

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Current Password");

        jPasswordField3.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton4)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Change Password", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel10.setText("If you have a query , an idea or a suggestion we would be most happy to");

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel19.setText("listen and will do our best to implement the same.");

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback_banner.jpg"))); // NOI18N

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel19))
                .addGap(21, 25, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(180, 180, 180)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Feedback", jPanel4);

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Name :  Shahnawaz Hossan\n\nReg : 2012331531\n\nDept :  CSE\n\nSylhet Engineering College\n\nPhone : 01674124965\n\n\n");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jTextArea4.setText("Name :  Enamul Haque\n\nReg : 2012331520\n\nDept :  CSE\n\nSylhet Engineering College\n\nPhone : 01684887824\n\n\n");
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        jTabbedPane1.addTab("Contact US", jPanel6);

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton6.setText("LOGOUT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane1KeyPressed
        // TODO add your handling code here:
        //        Profile ob = new Profile();
        //        ob.setVisible(true);
        //        dispose();
    }//GEN-LAST:event_jTabbedPane1KeyPressed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel DHA = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "AKHAURA",
            "BHAIRAB-BAZAR", "BOGURA", "BRAHMAN-BARIA",
            "COMILLA",
            "CHITTAGONG", "DINAJPUR",
            "FENI", "GAFARGAON",
            "JESSORE",
            "KHULNA",
            "MYMENSINGH", "MIRZAPUR",
            "NOAKHALI", "NEELFAMARI",
            "NARSHINGDI",
            "RAJSHAHI", "RANGPUR", "SIRAJGONJ-BAZAR",
            "SRIMANGLE", "SARISHA-BARI", "SHAISTAGANJ", "SYLHET",
            "TANGAIL"
        });

        DefaultComboBoxModel SYL = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "ASHUGANJ", "AZAMPUR", "AKHAURA", "BHAIRAB-BAZAR", "BRAHMAN-BARIA",
            "BHANUGACH", "COMILLA", "CHITTAGONG", "DHAKA", "BIMAN-BANDAR",
            "FENI", "HOROSHPUR", "KULAURA", "LAKSAM", "MUKUNDUPUR",
            "MAIZGAON", "MONTALA", "NANGAL-KOT", "NOAPARA", "QOSBA",
            "SHAHAGI-BAZAR", "SRIMANGLE", "SHAISTAGANJ", "SHAMSHERNAGAR"});

        DefaultComboBoxModel RAJ = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "ABDULPUR",
            "BBSETU-E",
            "CHUADANGA", "DHAKA",
            "DINAJPUR",
            "ISHURDI",
            "JESSORE", "JOYPURHAT",
            "KHULNA", "KUSTIA-COURT",
            "MIRZAPUR", "NEELFAMARI", "NATORE",
            "PARBATIPUR", "PAKSHI", "PHULBARI",
            "SHORDHA-ROAD",
            "S.MONSUR ALI", "TANGAIL", "ULLAPARA"});

        DefaultComboBoxModel CHITTA = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "AKHAURA", "BHAIRAB-BAZAR", "BRAHMAN-BARIA", "CHANDPUR", "CHITOSI-ROAD",
            "COMILLA", "CHANDPUR-COURT", "DHAKA", "BIMAN-BANDAR", "FENI",
            "HAJIGANJ", "HOROSHPUR", "KULAURA", "LAKSAM", "MEHER",
            "MAIZGAON", "NANGAL-KOT", "NAYAPARA", "NARSHINGDI", "QOSBA",
            "SHAMSHERNAGAR", "SHAISTAGANJ", "SRIMANGLE", "SYLHET",});

        DefaultComboBoxModel KHU = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "ALAMDANGA", "ABDULPUR",
            "BIRAMPUR", "BBSETU-W", "BORAL-BRIDGE",
            "CHUADANGA", "DHAKA",
            "DAULATPUR", "ISHURDI", "JESSORE", "JOYPURHAT", "JAYDEBPUR",
            "MIRZZAPUR", "NOAPARA",
            "NATORE", "PARBATIPUR", "PHULBARI",
            "RAJSHAHI", "SAIDPUR", "TANGAIL"});

        if ("#-SELECT STATION-#".equals(jComboBox5.getSelectedItem())) {
            jComboBox6.removeAllItems();
        } else if ("DHAKA".equals(jComboBox5.getSelectedItem())) {
            jComboBox6.removeAllItems();
            jComboBox6.setModel(DHA);
        } else if ("SYLHET".equals(jComboBox5.getSelectedItem())) {
            jComboBox6.removeAllItems();
            jComboBox6.setModel(SYL);
        } else if ("RAJSHAHI".equals(jComboBox5.getSelectedItem())) {
            jComboBox6.removeAllItems();
            jComboBox6.setModel(RAJ);
        } else if ("CHITTAGONG".equals(jComboBox5.getSelectedItem())) {
            jComboBox6.removeAllItems();
            jComboBox6.setModel(CHITTA);
        } else if ("KHULNA".equals(jComboBox5.getSelectedItem())) {
            jComboBox6.removeAllItems();
            jComboBox6.setModel(KHU);
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel DHA = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "AKHAURA",
            "BHAIRAB-BAZAR", "BOGURA", "BRAHMAN-BARIA",
            "COMILLA",
            "CHITTAGONG", "DINAJPUR",
            "FENI", "GAFARGAON",
            "JESSORE",
            "KHULNA",
            "MYMENSINGH", "MIRZAPUR",
            "NOAKHALI", "NEELFAMARI",
            "NARSHINGDI",
            "RAJSHAHI", "RANGPUR", "SIRAJGONJ-BAZAR",
            "SRIMANGLE", "SARISHA-BARI", "SHAISTAGANJ", "SYLHET",
            "TANGAIL"
        });

        DefaultComboBoxModel SYL = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "ASHUGANJ", "AZAMPUR", "AKHAURA", "BHAIRAB-BAZAR", "BRAHMAN-BARIA",
            "BHANUGACH", "COMILLA", "CHITTAGONG", "DHAKA", "BIMAN-BANDAR",
            "FENI", "HOROSHPUR", "KULAURA", "LAKSAM", "MUKUNDUPUR",
            "MAIZGAON", "MONTALA", "NANGAL-KOT", "NOAPARA", "QOSBA",
            "SHAHAGI-BAZAR", "SRIMANGLE", "SHAISTAGANJ", "SHAMSHERNAGAR"});

        DefaultComboBoxModel RAJ = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "ABDULPUR",
            "BBSETU-E",
            "CHUADANGA", "DHAKA",
            "DINAJPUR",
            "ISHURDI",
            "JESSORE", "JOYPURHAT",
            "KHULNA", "KUSTIA-COURT",
            "MIRZAPUR", "NEELFAMARI", "NATORE",
            "PARBATIPUR", "PAKSHI", "PHULBARI",
            "SHORDHA-ROAD",
            "S.MONSUR ALI", "TANGAIL", "ULLAPARA"});

        DefaultComboBoxModel CHITTA = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "AKHAURA", "BHAIRAB-BAZAR", "BRAHMAN-BARIA", "CHANDPUR", "CHITOSI-ROAD",
            "COMILLA", "CHANDPUR-COURT", "DHAKA", "BIMAN-BANDAR", "FENI",
            "HAJIGANG", "HOROSHPUR", "KULAURA", "LAKSAM", "MEHER",
            "MAIZGAON", "NANGAL-KOT", "NAYAPARA", "NARSHINGDI", "QOSBA",
            "SHAMSHERNAGAR", "SHAISTAGANJ", "SRIMANGLE", "SYLHET",});

        DefaultComboBoxModel KHU = new DefaultComboBoxModel(new String[]{
            "#-SELECT STATION-#", "ALAMDANGA", "ABDULPUR",
            "BIRAMPUR", "BBSETU-W", "BORAL-BRIDGE",
            "CHUADANGA", "DHAKA",
            "DAULATPUR", "ISHURDI", "JESSORE", "JOYPURHAT", "JAYDEBPUR",
            "MIRZAPUR", "NOAPARA",
            "NATORE", "PARBATIPUR", "PHULBARI",
            "RAJSHAHI", "SAIDPUR", "TANGAIL"});

        DefaultComboBoxModel slct = new DefaultComboBoxModel(new String[]{"#-SELECT STATION-#"});
        DefaultComboBoxModel slcttrn = new DefaultComboBoxModel(new String[]{"SELECT TRAIN"});

        if ("#-SELECT STATION-#".equals(jComboBox1.getSelectedItem())) {

            jComboBox2.setModel(slct);
            jComboBox3.setModel(slcttrn);

        } else if ("DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox2.removeAllItems();
            jComboBox2.setModel(DHA);
        } else if ("SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox2.removeAllItems();
            jComboBox2.setModel(SYL);
        } else if ("RAJSHAHI".equals(jComboBox1.getSelectedItem())) {
            jComboBox2.removeAllItems();
            jComboBox2.setModel(RAJ);
        } else if ("CHITTAGONG".equals(jComboBox1.getSelectedItem())) {
            jComboBox2.removeAllItems();
            jComboBox2.setModel(CHITTA);
        } else if ("KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox2.removeAllItems();
            jComboBox2.setModel(KHU);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel slct = new DefaultComboBoxModel(new String[]{"#-SELECT STATION-#"});
        DefaultComboBoxModel slcttrn = new DefaultComboBoxModel(new String[]{"SELECT TRAIN"});

        if ("#-SELECT STATION-#".equals(jComboBox2.getSelectedItem())) {

            jComboBox3.setModel(slcttrn);

        } else if ("AKHAURA".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(akh1);

        } else if ("BHAIRAB-BAZAR".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(bhrab1);
        } else if ("BOGURA".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(bog);
        } else if ("BRAHMAN-BARIA".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(bramon1);
        } else if ("COMILLA".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(comlai1);
        } else if ("CHITTAGONG".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(chita1);
        } else if ("DINAJPUR".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(dinaj1);
        } else if ("FENI".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(feni1);
        } else if ("GAFARGAON".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(gafar);
        } else if ("JESSORE".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(jessor1);
        } else if ("KHULNA".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(khul1);
        } else if ("MYMENSINGH".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(mymen);
        } else if ("MIRZAPUR".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(mirza1);
        } else if ("NOAKHALI".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(noa);
        } else if ("NEELFAMARI".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(neel);
        } else if ("NARSHINGDI".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(nars1);
        } else if ("RAJSHAHI".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(rajsha1);
        } else if ("RANGPUR".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(rang);
        } else if ("SIRAJGONJ-BAZAR".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(siraj);
        } else if ("SRIMANGLE".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(sri1);
        } else if ("SARISHA-BARI".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(sarisha);
        } else if ("SHAISTAGANJ".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(shaista1);
        } else if ("SYLHET".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(syl1);
        } else if ("TANGAIL".equals(jComboBox2.getSelectedItem()) && "DHAKA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(tang1);
        } else if ("ABDULPUR".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(abdul);

        } else if ("BBSETU-E".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(bbsu);

        } else if ("CHUADANGA".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(chua);

        } else if ("DHAKA".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(dhaka1);

        } else if ("DINAJPUR".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(dinaj);

        } else if ("ISHURDI".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(ishurdi);

        } else if ("JESSORE".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(jessor2);

        } else if ("JOYPURHAT".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(joypur);

        } else if ("KHULNA".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(khul2);

        } else if ("KUSTIA-COURT".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(kustia);

        } else if ("MIRZAPUR".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(mirja2);

        } else if ("NEELFAMARI".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(neelfa);

        } else if ("NATORE".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(nator);

        } else if ("PARBATIPUR".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(parba);

        } else if ("PAKSHI".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(abdul);

        } else if ("PHULBARI".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(phul);

        } else if ("SHORDHA-ROAD".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(sharda);

        } else if ("S.MONSUR ALI".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(smon);

        } else if ("TANGAIL".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(tang2);

        } else if ("ULLAPARA".equals(jComboBox2.getSelectedItem()) && "RAJSHAHI".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(ulla);

        } else if ("ALAMDANGA".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(alam);

        } else if ("ABDULPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(abdul1);

        } else if ("BIRAMPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(biram);

        } else if ("BBSETU-W".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(bbsw);

        } else if ("BORAL-BRIDGE".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(boral);

        } else if ("CHUADANGA".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(chua1);
        } else if ("DHAKA".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(dhaka2);
        } else if ("DAULATPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(dault);
        } else if ("ISHURDI".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(ishur);
        } else if ("JESSORE".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(jessor3);
        } else if ("JOYPURHAT".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(joypur2);

        } else if ("JAYDEBPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(jaydeb);
        } else if ("MIRZAPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(mirza3);

        } else if ("NOAPARA".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(noapara1);

        } else if ("NATORE".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(nator1);
        } else if ("PARBATIPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(parbati1);
        } else if ("PHULBARI".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(phul1);
        } else if ("RAJSHAHI".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(rajsha2);
        } else if ("SAIDPUR".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(said);
        } else if ("TANGAIL".equals(jComboBox2.getSelectedItem()) && "KHULNA".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(tang3);

        } else if ("AKHAURA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(akha2);

        } else if ("ASHUGANJ".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(ashu);
        } else if ("AZAMPUR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(azam);

        } else if ("BHAIRAB-BAZAR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(bharib2);

        } else if ("BRAHMAN-BARIA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(bramn);
        } else if ("BHANUGACH".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(bhan);

        } else if ("COMILLA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(comila);

        } else if ("CHITTAGONG".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(chita);

        } else if ("DHAKA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(dhaka);

        } else if ("BIMAN-BANDAR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(biman);

        } else if ("FENI".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(feni);

        } else if ("HOROSHPUR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(horos);

        } else if ("KULAURA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(kula);

        } else if ("LAKSAM".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(laksm);

        } else if ("MUKUNDUPUR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(mukondo);

        } else if ("MAIZGAON".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(maizgon);

        } else if ("MANTALA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(mantala);

        } else if ("NANGAL-KOT".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(nangol);

        } else if ("NOAPARA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(noa2);

        } else if ("QOSBA".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(qosba);

        } else if ("SHAHAGI-BAZAR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(shazi);

        } else if ("SRIMANGLE".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(srimongol3);

        } else if ("SHAISTAGANJ".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(shaista3);

        } else if ("SHAMSHERNAGAR".equals(jComboBox2.getSelectedItem()) && "SYLHET".equals(jComboBox1.getSelectedItem())) {
            jComboBox3.removeAllItems();
            jComboBox3.setModel(shamser33);

        } else if ("AKHAURA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(akhu3);

        } else if ("BHAIRAB-BAZAR".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(bharib3);

        } else if ("BRAHMAN-BARIA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(bramon);

        } else if ("CHANDPUR".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(chand);

        } else if ("CHITOSI-ROAD".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(chitos);

        } else if ("COMILLA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(comila3);

        } else if ("CHANDPUR-COURT".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(court);

        } else if ("DHAKA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(dhaka3);

        } else if ("BIMAN-BANDAR".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(biman3);

        } else if ("FENI".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(feni3);

        } else if ("HAJIGANJ".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(hajigong);

        } else if ("HOROSHPUR".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(horos3);

        } else if ("KULAURA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(kula3);

        } else if ("LAKSAM".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(laksm3);

        } else if ("MEHER".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(meher);

        } else if ("MAIZGAON".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(maizgon3);

        } else if ("NANGAL-KOT".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(nangol3);

        } else if ("NAYAPARA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(nayapara);

        } else if ("NARSINGDI".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(narsing);

        } else if ("QOSBA".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(qosba3);

        } else if ("SHAMSHERNAGAR".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(shemshr);

        } else if ("SHAISTAGANJ".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(shaista);

        } else if ("SRIMANGLE".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(srimong);

        } else if ("SYLHET".equals(jComboBox2.getSelectedItem()) && "CHITTAGONG".equals(jComboBox1.getSelectedItem())) {

            jComboBox3.removeAllItems();
            jComboBox3.setModel(sylhet);

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        TrainDetails td = new TrainDetails();

        DefaultTableModel mdl = (DefaultTableModel) td.jTable2.getModel();

        mdl.setRowCount(0);

        try {
            String c = "", d = "", e = "", f = "";

            String s = "", s1 = "", sql1, s2, s3, s4;

            int tag = 1;

            s = jComboBox5.getSelectedItem().toString();

            s1 = jComboBox6.getSelectedItem().toString();

            if (s.equals("") || s.equals("#-SELECT STATION-#") || s1.equals("#-SELECT STATION-#") || s1.equals("")) {

                JOptionPane.showMessageDialog(null, "Select the Departure and Destination station correctly");
                tag = 0;
            }
            if (tag == 1) {

                sql1 = "select * from traindetails where stationfrom='" + s + "' and stationto='" + s1 + "'";

                rs = con.prepareStatement(sql1).executeQuery();

                TrainDetails.jTextField1.setText(s);
                TrainDetails.jTextField2.setText(s1);

                TrainDetails.jTextField1.setEditable(false);
                TrainDetails.jTextField2.setEditable(false);

                while (rs.next()) {

                    c = rs.getString("trainno");
                    d = rs.getString("trainname");
                    e = rs.getString("departuretime");
                    f = rs.getString("offday");

                    mdl.addRow(new Object[]{c, d, e, f});
                }

                s2 = jTextField2.getText();
                s3 = jTextField4.getText();
                s4 = jTextField3.getText();

                TrainDetails.jTextField3.setText(s2);
                TrainDetails.jTextField4.setText(s3);
                TrainDetails.jTextField5.setText(s4);

                TrainDetails.jTextField3.setVisible(false);
                TrainDetails.jTextField4.setVisible(false);
                TrainDetails.jTextField5.setVisible(false);

                td.setVisible(true);
            }

        } catch (SQLException E) {
            System.out.println("Exception found");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String s, s1, sql, curr, nw, cnf, a, b, c, d, sql1;

        int tag = 0;
        try {

            s = jTextField4.getText();

            curr = jPasswordField1.getText();

            nw = jPasswordField2.getText();

            cnf = jPasswordField3.getText();

            sql = "select * from register where emailaddress='" + s + "'";

            rs = con.prepareStatement(sql).executeQuery();
            if (curr.equals("")) {
                JOptionPane.showMessageDialog(null, "Give your current password please !!!");
            } else if (nw.equals("") || cnf.equals("")) {
                JOptionPane.showMessageDialog(null, "Please give the new password and confirm it correctly !!!");
            } else if (rs.next()) {

                a = rs.getString("username");

                b = rs.getString("emailaddress");

                c = rs.getString("phone");

                d = rs.getString("password");

                if (s.equals(b)) {

                    if (nw.equals(cnf) && curr.equals(d)) {

                        sql1 = "update register set password='" + nw + "' , reenterpass='" + nw + "' where (emailaddress='" + s + "')";

                        con.prepareStatement(sql1).execute();

                        JOptionPane.showMessageDialog(null, "Your password is succesfully changed :)");

                        tag = 1;

                        jPasswordField1.setText(null);
                        jPasswordField2.setText(null);
                        jPasswordField3.setText(null);
                    } else {
                        tag = 1;
                        JOptionPane.showMessageDialog(null, "Your current password is not currect.");
                    }
                }
                if (tag == 0) {
                    JOptionPane.showMessageDialog(null, "New password and Comfirmed password\nshould be matched");
                }
            }

        } catch (Exception E) {
            System.out.println("Error!!");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String s1, s2 = "", sql;

        s1 = get;

        try {

            s2 = jTextArea2.getText();

            if (s2.equals("")) {

                JOptionPane.showMessageDialog(null, "Fill up the required fields please...\n");

            } else {

                //System.out.println("Yes"+s1);
                sql = "insert into feedback values('" + s1 + "','" + s2 + "')";

                con.prepareStatement(sql).execute();

                JOptionPane.showMessageDialog(null, "Thank you for your Feedback.\n");

            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextArea2.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "";

        s1 = jComboBox1.getSelectedItem().toString();
        s2 = jComboBox2.getSelectedItem().toString();
        s3 = jComboBox3.getSelectedItem().toString();
        s4 = jComboBox4.getSelectedItem().toString();
        s5 = jTextField1.getText();

        Random rn = new Random();

        int i, randomNum = rn.nextInt((270 - 250) + 1) + 250;
        int tag = 0;

        if (s1.equals("#-SELECT STATION-#") || s2.equals("#-SELECT STATION-#") || s3.equals("SELECT TRAIN") || s4.equals("#-SELECT CLASS-#")||s5.equals("")) {
            JOptionPane.showMessageDialog(null, "Fill up all the required criteria Please");
            tag = 1;
        }
        if (tag == 0) {

            switch (s4) {
                case "SHOVON":

                    randomNum = rn.nextInt((270 - 250) + 1) + 250;
                    break;

                case "S_CHAIR":

                    randomNum = rn.nextInt((300 - 275) + 1) + 275;
                    break;
                case "F_SEAT":

                    randomNum = rn.nextInt((350 - 325) + 1) + 325;
                    break;
                case "SNIGDHA":

                    randomNum = rn.nextInt((450 - 400) + 1) + 400;
                    break;
            }

            //System.out.println("" + s5);
            int num = Integer.parseInt(s5);

            int result = num * randomNum;

            //System.out.println("" + result);
            String s6 = "You've required\n";

            s6 += Integer.toString(result);

            s6 += " BDT";

            jTextArea1.setText(s6);

            jTextArea1.setEditable(false);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Information.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Maiandra GD", Font.BOLD, 16)));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
