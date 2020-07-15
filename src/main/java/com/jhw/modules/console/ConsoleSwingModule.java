package com.jhw.modules.console;

import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.swing.material.standars.MaterialColors;
import com.jhw.swing.material.standars.MaterialIcons;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ConsoleSwingModule implements AbstractSwingModule {

    public static final ConsoleFrame consoleFrame = new ConsoleFrame();

    @Override
    public void register(AbstractSwingApplication app) {
        registerTecnologyElements(app);
        System.out.println("Bienvenido a la consola..... ☺");
        System.out.println("Aqui se ve todo el trabajo en background del sistema.");
    }

    private void registerTecnologyElements(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();
        dash.addKeyValue(DashboardConstants.UP_ELEMENT, new AbstractAction("Consola", MaterialIcons.DEVELOPER_BOARD.deriveIcon(MaterialColors.WHITE)) {
            @Override
            public void actionPerformed(ActionEvent e) {
                showConsole();
            }
        });
    }

    public void showConsole() {
        consoleFrame.setVisible(true);
    }

    /**
     * Dont need navigation
     *
     * @param string
     * @param o
     */
    @Override
    public void navigateTo(String string, Object... o) {
    }

}