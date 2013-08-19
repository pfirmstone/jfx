/*
 * Copyright (c) 2008, 2013 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ensemble.samples.controls.splitpane.hiddensplitpane;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.SplitPaneBuilder;
import javafx.scene.layout.RegionBuilder;
import javafx.stage.Stage;

/**
 * A sample that demonstrates styling a hidden split pane with CSS.
 *
 * @sampleName Hidden SplitPane
 * @preview preview.png
 * @see javafx.scene.control.SplitPane 
 */
public class HiddenSplitPaneApp extends Application {

    public Parent createContent() {
        String hidingSplitPaneCss = HiddenSplitPaneApp.class.getResource("HiddenSplitPane.css").toExternalForm();
        final SplitPane splitPane = SplitPaneBuilder.create().id("hiddenSplitter").items(
                RegionBuilder.create().styleClass("rounded").build(),
                RegionBuilder.create().styleClass("rounded").build(),
                RegionBuilder.create().styleClass("rounded").build()).dividerPositions(new double[]{0.33, 0.66}).build();
        splitPane.getStylesheets().add(hidingSplitPaneCss);

        return splitPane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}