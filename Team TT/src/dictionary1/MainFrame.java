package dictionary1;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import com.sun.speech.freetts.*;
import java.util.Collections;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;

public class MainFrame extends javax.swing.JFrame {
    ReadData data = new ReadData();
    Searcher search = new Searcher();
    Recent recent = new Recent();
    ModifyDic modify = new ModifyDic();
    ModifyFrame mf;
    
    String path = "data\\E_V.zip", recentPath = "data\\recentWordE_V.txt";
    String fileName = "E_V.txt";
    DefaultListModel modelRecent ;
    DefaultListModel model ;
    String showWord;
    int showingContent = 0, whatToDo = 0;
    ArrayList recentList = recent.readIn(recentPath);
    
  
    public MainFrame() {
        data.readIn(path);
        initComponents();
        inItData();
        jRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png")));
        btEditWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png")));
        btNewWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addicon.png")));
        btTexttoSpeech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/speaker.png")));

    }

    private void inItData(){

        model = new DefaultListModel();
        ArrayList list = data.getList();

        for(int i=0; i<list.size(); i++){
            model.addElement(list.get(i));
        }
        jList.setModel(model);
    }
    private void suggestionUpdate(){
        ArrayList list ;
        if(jSearch.getText()==null){
            list = new ArrayList(data.list);
        }
        else list = search.searchResult(jSearch.getText(), data.list);
        //Collections.sort(list);
        if(list.size()>=2)
            Collections.sort(list.subList(1, list.size()));

        model = new DefaultListModel();
        for(int i=0; i<list.size(); i++){
            model.addElement(list.get(i));
        }
        jList.setModel(model);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jFrame5 = new javax.swing.JFrame();
        jFrame6 = new javax.swing.JFrame();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSearch = new javax.swing.JTextField();
        btSuggest = new javax.swing.JButton();
        btRecent = new javax.swing.JButton();
        btTexttoSpeech = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        meaningsArea = new javax.swing.JEditorPane();
        meaningsArea.setContentType("text/html");
        //meaningsArea.setText(data.getMeanings().get(wordIndex).toString());
        jRemove = new javax.swing.JButton();
        btNewWord = new javax.swing.JButton();
        btEditWord = new javax.swing.JButton();
        btSwitch = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame6.setTitle("h");
        jFrame6.setAlwaysOnTop(true);

        javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
        jFrame6.getContentPane().setLayout(jFrame6Layout);
        jFrame6Layout.setHorizontalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame6Layout.setVerticalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TT's Dictionary");
        setBounds(new java.awt.Rectangle(300, 120, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSearch.setToolTipText("Search here");
        jSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyReleased(evt);
            }
        });

        btSuggest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btSuggest.setToolTipText("Suggestion for your Searching");
        btSuggest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuggestActionPerformed(evt);
            }
        });

        btRecent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/recent.png"))); // NOI18N
        btRecent.setToolTipText("Recent words");
        btRecent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecentActionPerformed(evt);
            }
        });

        btTexttoSpeech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/speaker.png"))); // NOI18N
        btTexttoSpeech.setToolTipText("Text to speech");
        btTexttoSpeech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTexttoSpeechActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList);

        meaningsArea.setEditable(false);
        meaningsArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(meaningsArea);

        jRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove.png"))); // NOI18N
        jRemove.setToolTipText("Remove this word");
        jRemove.setMaximumSize(new java.awt.Dimension(55, 26));
        jRemove.setMinimumSize(new java.awt.Dimension(55, 26));
        jRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveActionPerformed(evt);
            }
        });

        btNewWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addicon.png"))); // NOI18N
        btNewWord.setToolTipText("Add a new word");
        btNewWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewWordActionPerformed(evt);
            }
        });

        btEditWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        btEditWord.setToolTipText("Edit this word");
        btEditWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditWordActionPerformed(evt);
            }
        });

        btSwitch.setText("E->V");
        btSwitch.setToolTipText("You are using this dictionary");
        btSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSwitchActionPerformed(evt);
            }
        });

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btSave.setToolTipText("Save your changes");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("A gift from god");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSearch)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btSuggest, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btRecent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditWord, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btTexttoSpeech, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNewWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSuggest, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRecent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTexttoSpeech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRecentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecentActionPerformed
        // TODO add your handling code here:
        modelRecent = new DefaultListModel();
        for(int i=recentList.size()-1; i>0; i--){
            modelRecent.addElement(recentList.get(i));
        }
        jList.setModel(modelRecent);
        showingContent = 1;
    }//GEN-LAST:event_btRecentActionPerformed

    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        // TODO add your handling code here:
        showWord = jList.getSelectedValue();
        if(data.list.indexOf(showWord)==-1)
            meaningsArea.setText("Choose a word");
        else {
            meaningsArea.setText(data.meanings.get(data.list.indexOf(showWord)).toString());
            recent.addWord(recentList, showWord);
        }
    }//GEN-LAST:event_jListValueChanged

    private void jSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyReleased
        // TODO add your handling code here:
        suggestionUpdate();
        showingContent = 0;
    }//GEN-LAST:event_jSearchKeyReleased

    private void btSuggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuggestActionPerformed
        // TODO add your handling code here:
        suggestionUpdate();
        showingContent = 0;
    }//GEN-LAST:event_btSuggestActionPerformed

    private void jRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveActionPerformed
        // TODO add your handling code here:
        if(jList.getSelectedValue()==null){
            JOptionPane.showMessageDialog(null, "Choose a word");
        }
        else{
            int pt = data.list.indexOf(jList.getSelectedValue());
            int click = JOptionPane.showConfirmDialog(null, "You are deleting this word, continue ?", "Think twice", JOptionPane.YES_NO_OPTION);
            if(click == JOptionPane.YES_OPTION){
                if(showingContent == 0){
                    modify.removeWord(data.list.get(pt).toString(), data.list, data.meanings);
                    model.removeElementAt(jList.getSelectedIndex());

                    jList.setModel(model);
                }
                else{
                    recentList.remove(jList.getSelectedValue());
                    modelRecent.removeElementAt(jList.getSelectedIndex());
                    jList.setModel(modelRecent);
                }
            }
        }
    }//GEN-LAST:event_jRemoveActionPerformed

    private void btNewWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewWordActionPerformed
        // TODO add your handling code here:
        whatToDo = 0;
        if(mf == null){
            mf = new ModifyFrame();
            mf.setVisible(true);
        }
        mf.setVisible(true);
        mf.newMeaning.setContentType("text/plain");
    }//GEN-LAST:event_btNewWordActionPerformed

    private void btEditWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditWordActionPerformed
        // TODO add your handling code here:
        whatToDo = 1;
        if(jList.getSelectedValue() == null){
            JOptionPane.showMessageDialog(null, "Select a word");
        }
        else{
            if(mf == null){
            mf = new ModifyFrame();
            mf.setVisible(true);
            }
        mf.setVisible(true);
        mf.newMeaning.setContentType("text/html");
        }
        mf.newWord.setText(jList.getSelectedValue());
        mf.newMeaning.setText(meaningsArea.getText());
    }//GEN-LAST:event_btEditWordActionPerformed
    private static final String VOICENAME = "kevin16";
    private void btTexttoSpeechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTexttoSpeechActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);

        voice.allocate();
        if (jList.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Choose a word");
        } else {
            try {
                voice.speak(jList.getSelectedValue());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btTexttoSpeechActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int click = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit ?", "Quit", JOptionPane.YES_NO_OPTION);
        if(click == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSwitchActionPerformed
        if(btSwitch.getText().equals("E->V")){
            btSwitch.setText("V->E");
            path = "data\\V_E.zip";
            recentPath = "data\\recentWordV_E.txt";
            fileName = "V_E.txt";
            data.readIn(path);
            recentList = recent.readIn(recentPath);

            suggestionUpdate();
        }

        else{
            btSwitch.setText("E->V");
            path = "data\\E_V.zip";
            recentPath = "data\\recentWordE_V.txt";
            fileName = "E_V.txt";
            data.readIn(path);
            recentList = recent.readIn(recentPath);
            
            suggestionUpdate();
        }
    }//GEN-LAST:event_btSwitchActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        recent.write(recentList, recentPath);
        modify.writeList(data.list, data.meanings, path, fileName);
    }//GEN-LAST:event_btSaveActionPerformed
    
     public static void run() {
        try {
        javax.swing.UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());

        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public class ModifyFrame extends javax.swing.JFrame {

        String word, meaning;

        public ModifyFrame() {
            initComponents();
            try {
                javax.swing.UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

            newWord = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            btSave = new javax.swing.JButton();
            btCancel = new javax.swing.JButton();
            jScrollPane2 = new javax.swing.JScrollPane();
            newMeaning = new javax.swing.JEditorPane();
            newMeaning.setContentType("text/html");

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Modify your word");

            newWord.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newWordActionPerformed(evt);
                }
            });

            jLabel1.setText("Word:");

            jLabel2.setText("What does it mean?");

            btSave.setText("Save");
            btSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btSaveActionPerformed(evt);
                }
            });

            btCancel.setText("Cancel");
            btCancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btCancelActionPerformed(evt);
                }
            });

            jScrollPane2.setViewportView(newMeaning);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(newWord)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(191, 191, 191)
                                                    .addComponent(btSave)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(btCancel)
                                                    .addGap(0, 180, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jScrollPane2)))
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(newWord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btSave)
                                            .addComponent(btCancel))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void newWordActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            newWord.setText("");
            newMeaning.setText("");
            setVisible(false);
        }

        private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            word = newWord.getText();
            meaning = newMeaning.getText();

            if (whatToDo == 0) {
                if (word == null || meaning == null) {
                    JOptionPane.showMessageDialog(null, "Type in something");
                } else {
                    modify.addWord(word, meaning, data.list, data.meanings);
                    suggestionUpdate();
                }
            } else {
                if (word == null || meaning == null) {
                    JOptionPane.showMessageDialog(null, "Type in something");
                } else {
                    modify.editword(word, meaning, jList.getSelectedValue(), data.list, data.meanings);
                    suggestionUpdate();
                }
            }
            newWord.setText("");
            newMeaning.setText("");
            setVisible(false);
        }
        private javax.swing.JButton btCancel;
        private javax.swing.JButton btSave;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JEditorPane newMeaning;
        private javax.swing.JTextField newWord;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditWord;
    private javax.swing.JButton btNewWord;
    private javax.swing.JButton btRecent;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSuggest;
    private javax.swing.JButton btSwitch;
    private javax.swing.JButton btTexttoSpeech;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JFrame jFrame6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton jRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jSearch;
    private javax.swing.JEditorPane meaningsArea;
    // End of variables declaration//GEN-END:variables
}
