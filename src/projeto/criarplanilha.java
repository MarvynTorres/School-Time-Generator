/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.ToolTipManager;
import java.awt.event.KeyEvent;
import javax.swing.table.TableModel;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author faetec
 */
public class criarplanilha extends javax.swing.JFrame {

    /**
     * Creates new form criarplanilha
     */
    public criarplanilha() {
        initComponents();
 
        //determina o tempo que a dica ficara a mostra, quando passar o mouse por cima
        //dos jtextfields
        ToolTipManager manager = ToolTipManager.sharedInstance();
        manager.setInitialDelay(100); 
        UIManager.put("ToolTipManager.sharedInstance", manager);
        
        //deixa o aviso do "JTFturma" invisível
        JLaviso.setVisible(false);
        
        //seta a fonte do jTable como arial, negrito e tamanho 16
        JTplanilha.setFont(new Font("Arial", Font.BOLD, 14)); 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSPpainel = new javax.swing.JScrollPane();
        JTplanilha = new javax.swing.JTable();
        JTFprofessor = new javax.swing.JTextField();
        JTFmateria = new javax.swing.JTextField();
        JTFhorai = new javax.swing.JTextField();
        JTFhorat = new javax.swing.JTextField();
        JLprofessor = new javax.swing.JLabel();
        JLmateria = new javax.swing.JLabel();
        JLhorai = new javax.swing.JLabel();
        JLhorat = new javax.swing.JLabel();
        JBinserir = new javax.swing.JButton();
        JBlimpar = new javax.swing.JButton();
        JBeditar = new javax.swing.JButton();
        JBsalvar = new javax.swing.JButton();
        JTFturma = new javax.swing.JTextField();
        JLturma = new javax.swing.JLabel();
        JLtitulo = new javax.swing.JLabel();
        JLdiasemana = new javax.swing.JLabel();
        JTFdiasemana = new javax.swing.JTextField();
        JLaviso = new javax.swing.JLabel();

        setTitle("Gerador de Planilhas");
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        JSPpainel.setToolTipText("É possível redimensionar a largura das colunas, ao arrastar a borda.");

        JTplanilha.setBackground(new java.awt.Color(0, 0, 0));
        JTplanilha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTplanilha = new javax.swing.JTable(){
            public boolean isCellEditable(int RowIndex, int colIndex){
                return false;
            }
        };
        JTplanilha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hora", "Segunda", "Terça", "Quarta", "Quinta", "Sexta"
            }
        ));
        JTplanilha.setToolTipText("É possível redimensionar a largura das colunas, ao arrastar a borda.");
        JSPpainel.setViewportView(JTplanilha);

        JTFprofessor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTFprofessor.setToolTipText("Ex.: Ronaldo");
        JTFprofessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFprofessorMouseClicked(evt);
            }
        });
        JTFprofessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFprofessorKeyPressed(evt);
            }
        });

        JTFmateria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTFmateria.setToolTipText("Ex.: Matemática");
        JTFmateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFmateriaKeyPressed(evt);
            }
        });

        JTFhorai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTFhorai.setToolTipText("Ex.: 8:40h");
        JTFhorai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFhoraiKeyPressed(evt);
            }
        });

        JTFhorat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTFhorat.setToolTipText("Ex.: 10:20h");
        JTFhorat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFhoratKeyPressed(evt);
            }
        });

        JLprofessor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLprofessor.setText("Professor:");

        JLmateria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLmateria.setText("Matéria:");

        JLhorai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLhorai.setText("Hora início:");

        JLhorat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLhorat.setText("Hora término:");

        JBinserir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBinserir.setText("Inserir");
        JBinserir.setToolTipText("Insere as informações digitadas nos campos correspondentes da planilha.");
        JBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBinserirActionPerformed(evt);
            }
        });

        JBlimpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBlimpar.setText("Limpar");
        JBlimpar.setToolTipText("Limpa todas as informações da planilha ou da coluna selecionada.");
        JBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimparActionPerformed(evt);
            }
        });

        JBeditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBeditar.setText("Editar");
        JBeditar.setToolTipText("Selecione uma coluna que deseja editar e aperte esse botão para editar.");
        JBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeditarActionPerformed(evt);
            }
        });

        JBsalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JBsalvar.setText("Salvar como imagem");
        JBsalvar.setToolTipText("Salva como imagem, para imprimir ou enviar.");
        JBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalvarActionPerformed(evt);
            }
        });

        JTFturma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTFturma.setToolTipText("Ex.: 1001 OU Automação");
        JTFturma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFturmaMouseClicked(evt);
            }
        });
        JTFturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFturmaActionPerformed(evt);
            }
        });
        JTFturma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFturmaKeyPressed(evt);
            }
        });

        JLturma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLturma.setText("Turma:");

        JLtitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        JLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLdiasemana.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JLdiasemana.setText("Dia Semana:");

        JTFdiasemana.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTFdiasemana.setToolTipText("Ex.: Segunda");
        JTFdiasemana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFdiasemanaKeyPressed(evt);
            }
        });

        JLaviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JLaviso.setText("(Não precisa preencher novamente)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSPpainel)
            .addComponent(JLtitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(JBsalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(JBinserir)
                        .addGap(76, 76, 76)
                        .addComponent(JBeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(JBlimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLdiasemana)
                            .addComponent(JLhorai)
                            .addComponent(JLhorat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFhorat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFhorai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFdiasemana, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLturma)
                                .addGap(38, 38, 38)
                                .addComponent(JTFturma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLaviso))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLmateria)
                                    .addComponent(JLprofessor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFprofessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFmateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLdiasemana)
                            .addComponent(JTFdiasemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLhorai)
                            .addComponent(JTFhorai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLprofessor)
                            .addComponent(JTFprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLmateria)
                            .addComponent(JTFmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLhorat)
                    .addComponent(JTFhorat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLturma)
                    .addComponent(JTFturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLaviso))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBinserir)
                    .addComponent(JBlimpar)
                    .addComponent(JBeditar))
                .addGap(18, 18, 18)
                .addComponent(JBsalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSPpainel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void JTFprofessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFprofessorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFprofessorMouseClicked

    //variável linha, que vai definir a linha onde serão inseridos os textos
    Integer linha = 0;
    //variável linhavazia, que irá ser usada num loop para descobrir a última linha vazia
    //e inserir as informações
    int linhavazia = 0;
    private void JBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinserirActionPerformed
        // TODO add your handling code here:
     
        
    //pega o texto dos jtextfields e armazena nas variáveis    
    String diasemana = JTFdiasemana.getText();
    String dialetivo = JTFprofessor.getText()+": "+JTFmateria.getText();
    String turma = JTFturma.getText();
    String professor = JTFprofessor.getText();
    String horainicio = JTFhorai.getText();
    String horatermino = JTFhorat.getText();
    String materia = JTFmateria.getText();
    String horario = JTFhorai.getText()+" às "+JTFhorat.getText();
    
    //cria a variável coluna, que vai depender do dia da semana escrito
    int coluna;
    coluna = -1;
    
    //cria uma variável do tipo "defaulttablemodel", que armazena o modelo da planilha
    DefaultTableModel modelo = (DefaultTableModel) JTplanilha.getModel();
    
    //condicional, para os dados só serem inseridos se todos os campos forem preenchidos
    //e o dia da semana estiver escrito corretamente
    if((!diasemana.isEmpty())&&(!professor.isEmpty())&&(!materia.isEmpty())
      ){
        
        //insere o texto na coluna correspondente ao dia da semana
switch (diasemana) {
    case "Segunda":
        coluna = 1;
        break;
    case "Terça":
        coluna = 2;
        break;
    case "Quarta":
        coluna = 3;
        break;
    case "Quinta":
        coluna = 4;
        break;
    case "Sexta":
        coluna = 5;
        break;
    case "segunda":
        coluna = 1;
        break;
    case "terça":
        coluna = 2;
        break;
    case "quarta":
        coluna = 3;
        break;
    case "quinta":
        coluna = 4;
        break;
    case "sexta":
        coluna = 5;
        break;    
    default:
        // Caso o usuário digite um dia de semana inválido, não faz nada e aparece uma mensagem
        //de aviso
        JOptionPane.showMessageDialog(null, "Preencha o campo 'dia da semana' corretamente");
        return;
    }   
        //se tiver tudo preenchido certinho, prosegue o programa
        if(coluna!=-1){
         
        //cria uma linha só se não houver nenhuma linha ainda          
            if(modelo.getRowCount() == 0){
            Object[] novalinha = new Object[modelo.getColumnCount()];
            modelo.addRow(novalinha);
            }
            
     
        //cria uma nova linha, caso a última da coluna selecionada esteja preenchida
        while (modelo.getValueAt(linha, coluna) != null){
        if (modelo.getValueAt(linha, coluna) != null){
            Object[] novalinha = new Object[modelo.getColumnCount()];
            modelo.addRow(novalinha);
            linha++;
        }
        else 
            break;
        }   
            
        // percorre todas as linhas da coluna selecionada
            for (int i = 0; i < JTplanilha.getRowCount(); i++) {
            // obtém o valor da célula atual
            String valorCélula = (String) JTplanilha.getValueAt(i, coluna);

            // verifica se o valor da célula está vazio
            if (valorCélula == null || valorCélula.trim().isEmpty()) {
                // atualiza o valor da célula com o valor inserido pelo usuário
                modelo.setValueAt(dialetivo, i, coluna);
                if(modelo.getValueAt(i, 0) == null){
                    modelo.setValueAt(horario, i, 0);
                }
                // sai do loop
                break;
            }
        }
            //só seta o texto do título se o jtextfield da turma
            //estiver preenchido
            if (!turma.isEmpty()){
            JLtitulo.setText(turma);
            }
            
            //apaga todos os jtextfields após inserí-los
            JTFprofessor.setText("");
            JTFdiasemana.setText("");
            JTFhorai.setText("");
            JTFhorat.setText("");
            JTFmateria.setText("");
            JTFturma.setText("");
        }
            //volta o foco pro jtextfield do nome do professor, após inseri los
            JTFdiasemana.requestFocus();
            
            //só mostra o aviso se já tiver algo no nome da turma
            if(!JLtitulo.getText().equals("")){
                JLaviso.setVisible(true);
            }
    }
    else{
        //caso tenha algum campo vazio, aparece um aviso solicitando que preencha
        JOptionPane.showMessageDialog(null, "Preencha os campos corretamente antes de inserir");
        //volta o foco para o jtextfield do professor
        JTFdiasemana.requestFocus();
        
        }  
    }//GEN-LAST:event_JBinserirActionPerformed

    private void JTFturmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFturmaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFturmaMouseClicked

    private void JTFturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFturmaActionPerformed


        
    }//GEN-LAST:event_JTFturmaActionPerformed

    private void JBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimparActionPerformed
        // TODO add your handling code here:
        //armazena a linha e a coluna que estão sendo selecionadas pelo usuário
    int linhaselecionada = JTplanilha.getSelectedRow();    
    int colunaselecionada = JTplanilha.getSelectedColumn();
    //se ele não selecionar nenhuma coluna, nem nenhuma linha, ele limpa a planilha toda
    if((linhaselecionada == -1)&&(colunaselecionada == -1)){    
        //esvazia todos os jtexfields 
        JTFprofessor.setText("");
        JTFdiasemana.setText("");
        JTFhorai.setText("");
        JTFhorat.setText("");
        JTFmateria.setText("");
        JTFturma.setText("");
        
        //remove todas as linhas da tabela
        DefaultTableModel modelo = (DefaultTableModel) JTplanilha.getModel();
        modelo.setRowCount(0);
        
        //desaparece com o nome da turma
        JLtitulo.setText("");
        JLtitulo.setVisible(false);
        
        //desaparece com o aviso do nome da turma
        JLaviso.setVisible(false);
    }
    //caso ele selecione alguma linha e alguma coluna, ele limpa apenas aquela selecionada
    else if ((linhaselecionada != -1)&&(colunaselecionada != -1)){
        TableModel modelo = JTplanilha.getModel();
        for (int col = 0; col < JTplanilha.getColumnCount(); col++) {
        modelo.setValueAt(null, linhaselecionada, colunaselecionada);
}
    }
    //deseleciona a linha e a coluna, após limpá-las
    JTplanilha.clearSelection();
    }//GEN-LAST:event_JBlimparActionPerformed

    private void JTFturmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFturmaKeyPressed
        // TODO add your handling code here:
        //após apertar enter, insere as informações na tabela
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        // TODO add your handling code here:
     
        
    //pega o texto dos jtextfields e armazena nas variáveis    
    String diasemana = JTFdiasemana.getText();
    String dialetivo = JTFprofessor.getText()+": "+JTFmateria.getText();
    String turma = JTFturma.getText();
    String professor = JTFprofessor.getText();
    String horainicio = JTFhorai.getText();
    String horatermino = JTFhorat.getText();
    String materia = JTFmateria.getText();
    String horario = JTFhorai.getText()+" às "+JTFhorat.getText();
    
    //cria a variável coluna, que vai depender do dia da semana escrito
    int coluna;
    coluna = -1;
    
    //cria uma variável do tipo "defaulttablemodel", que armazena o modelo da planilha
    DefaultTableModel modelo = (DefaultTableModel) JTplanilha.getModel();
    
    //condicional, para os dados só serem inseridos se todos os campos forem preenchidos
    //e o dia da semana estiver escrito corretamente
    if((!diasemana.isEmpty())&&(!professor.isEmpty())&&(!materia.isEmpty())
      ){
        
        //insere o texto na coluna correspondente ao dia da semana
switch (diasemana) {
    case "Segunda":
        coluna = 1;
        break;
    case "Terça":
        coluna = 2;
        break;
    case "Quarta":
        coluna = 3;
        break;
    case "Quinta":
        coluna = 4;
        break;
    case "Sexta":
        coluna = 5;
        break;
    case "segunda":
        coluna = 1;
        break;
    case "terça":
        coluna = 2;
        break;
    case "quarta":
        coluna = 3;
        break;
    case "quinta":
        coluna = 4;
        break;
    case "sexta":
        coluna = 5;
        break;    
    default:
        // Caso o usuário digite um dia de semana inválido, não faz nada e aparece uma mensagem
        //de aviso
        JOptionPane.showMessageDialog(null, "Preencha o campo 'dia da semana' corretamente");
        return;
    }   
        //se tiver tudo preenchido certinho, prosegue o programa
        if(coluna!=-1){
         
        //cria uma linha só se não houver nenhuma linha ainda          
            if(modelo.getRowCount() == 0){
            Object[] novalinha = new Object[modelo.getColumnCount()];
            modelo.addRow(novalinha);
            }
            
     
        //cria uma nova linha, caso a última da coluna selecionada esteja preenchida
        while (modelo.getValueAt(linha, coluna) != null){
        if (modelo.getValueAt(linha, coluna) != null){
            Object[] novalinha = new Object[modelo.getColumnCount()];
            modelo.addRow(novalinha);
            linha++;
        }
        else 
            break;
        }   
            
        // percorre todas as linhas da coluna selecionada
            for (int i = 0; i < JTplanilha.getRowCount(); i++) {
            // obtém o valor da célula atual
            String valorCélula = (String) JTplanilha.getValueAt(i, coluna);

            // verifica se o valor da célula está vazio
            if (valorCélula == null || valorCélula.trim().isEmpty()) {
                // atualiza o valor da célula com o valor inserido pelo usuário
                modelo.setValueAt(dialetivo, i, coluna);
                if(modelo.getValueAt(i, 0) == null){
                    modelo.setValueAt(horario, i, 0);
                }
                // sai do loop
                break;
            }
        }
            //só seta o texto do título se o jtextfield da turma
            //estiver preenchido
            if (!turma.isEmpty()){
            JLtitulo.setText(turma);
            }
            
            //apaga todos os jtextfields após inserí-los
            JTFprofessor.setText("");
            JTFdiasemana.setText("");
            JTFhorai.setText("");
            JTFhorat.setText("");
            JTFmateria.setText("");
            JTFturma.setText("");
        }
            //volta o foco pro jtextfield do nome do professor, após inseri los
            JTFdiasemana.requestFocus();
            
            //só mostra o aviso se já tiver algo no nome da turma
            if(!JLtitulo.getText().equals("")){
                JLaviso.setVisible(true);
            }
    }
    else{
        //caso tenha algum campo vazio, aparece um aviso solicitando que preencha
        JOptionPane.showMessageDialog(null, "Preencha os campos corretamente antes de inserir");
        //volta o foco para o jtextfield do professor
        JTFdiasemana.requestFocus();
        
        }            
            
        }
        
    }//GEN-LAST:event_JTFturmaKeyPressed

    private void JTFprofessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFprofessorKeyPressed
        // TODO add your handling code here:
        //após apertar enter, pula pro jtextfield de baixo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTFmateria.requestFocus();
        }
        
    }//GEN-LAST:event_JTFprofessorKeyPressed

    private void JTFmateriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFmateriaKeyPressed
        // TODO add your handling code here:
        //após apertar enter, pula pro jtextfield de baixo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTFturma.requestFocus();
        }
        
    }//GEN-LAST:event_JTFmateriaKeyPressed

    private void JTFdiasemanaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFdiasemanaKeyPressed
        // TODO add your handling code here:
        //após apertar enter, pula pro jtextfield de baixo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTFhorai.requestFocus();
        }
        
    }//GEN-LAST:event_JTFdiasemanaKeyPressed

    private void JTFhoraiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFhoraiKeyPressed
        // TODO add your handling code here:
        //após apertar enter, pula pro jtextfield de baixo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JTFhorat.requestFocus();
        }
        
    }//GEN-LAST:event_JTFhoraiKeyPressed

    private void JBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeditarActionPerformed
        // TODO add your handling code here:
 
            // Obtém a linha selecionada na tabela
    int linhaselecionada = JTplanilha.getSelectedRow();
    int colunaselecionada = JTplanilha.getSelectedColumn();
    
    //se selecionar uma linha, aparece um joptionpane pra escrever o que ele quer inserir
     if (linhaselecionada != -1 && colunaselecionada != -1) {
            // obtém o valor atual da célula selecionada
            Object valoratual = JTplanilha.getValueAt(linhaselecionada, colunaselecionada);

            // cria um JOptionPane para solicitar o novo valor da célula
            String novovalor = JOptionPane.showInputDialog("Novo valor:", valoratual);
        
             if (novovalor != null && !novovalor.isEmpty()) {
                // define o novo valor da célula
                JTplanilha.setValueAt(novovalor, linhaselecionada, colunaselecionada);
                JTplanilha.clearSelection();
            } 
             //se não escrever nada, aparece uma mensagem de aviso
            else {
                JOptionPane.showMessageDialog(null, "Escreva a informação que deseja inserir");
            }
 
        }
            //se não selecionar nenhuma linha, aparece uma mensagem de aviso
     else if(linhaselecionada == -1 || colunaselecionada == -1)
            JOptionPane.showMessageDialog(this, "Selecione uma coluna para editar");
    }//GEN-LAST:event_JBeditarActionPerformed

    public void saveTableAsImage(JScrollPane table, File file) {
    try {
        // cria uma imagem do tamanho do jscrollpane
        BufferedImage image = new BufferedImage(table.getWidth(), table.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        // desenha a tabela na imagem
        Graphics2D g2 = image.createGraphics();
        table.print(g2);
        g2.dispose();
        
        // salva a imagem no arquivo especificado
        ImageIO.write(image, "png", file);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
    
    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        // TODO add your handling code here:
        //abre um JFileChooser, com o nome de "chooser"
        JFileChooser chooser = new JFileChooser();
        
        
    int returnVal = chooser.showSaveDialog(this);
    //se o valor do arquivo escolhido for válido
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        
        File file = chooser.getSelectedFile();
        //cria uma variável para armazenar o nome do arquivo que está sendo salvo
        String filename = file.getName();
        
        //confere se o arquivo tem o ".png" no final, e caso não tenha
        //adiciona automaticamente
        if (!filename.endsWith(".png")) {
            file = new File(file.getParentFile(), filename + ".png");
        }
        //salva a tabela como imagem, usando o método "saveTableAsImage, criado acima
        //com a extensão ".png" no final
        saveTableAsImage(JSPpainel, file);
    }
        
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JTFhoratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFhoratKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode()) == evt.VK_ENTER){

        JTFprofessor.requestFocus();    
            
        }        
    }//GEN-LAST:event_JTFhoratKeyPressed

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
            java.util.logging.Logger.getLogger(criarplanilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(criarplanilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(criarplanilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(criarplanilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new criarplanilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBeditar;
    private javax.swing.JButton JBinserir;
    private javax.swing.JButton JBlimpar;
    private javax.swing.JButton JBsalvar;
    private javax.swing.JLabel JLaviso;
    private javax.swing.JLabel JLdiasemana;
    private javax.swing.JLabel JLhorai;
    private javax.swing.JLabel JLhorat;
    private javax.swing.JLabel JLmateria;
    private javax.swing.JLabel JLprofessor;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JLabel JLturma;
    private javax.swing.JScrollPane JSPpainel;
    private javax.swing.JTextField JTFdiasemana;
    private javax.swing.JTextField JTFhorai;
    private javax.swing.JTextField JTFhorat;
    private javax.swing.JTextField JTFmateria;
    private javax.swing.JTextField JTFprofessor;
    private javax.swing.JTextField JTFturma;
    public javax.swing.JTable JTplanilha;
    // End of variables declaration//GEN-END:variables
}
