(ns dots.typescript.editor-options)

(defn base-indent-size
  ^js [editor-options]
  (.-BaseIndentSize ^js editor-options))

(defn set-base-indent-size!
  ^js [editor-options value]
  (set! (.-BaseIndentSize ^js editor-options) value))

(defn indent-size
  ^js [editor-options]
  (.-IndentSize ^js editor-options))

(defn set-indent-size!
  ^js [editor-options value]
  (set! (.-IndentSize ^js editor-options) value))

(defn tab-size
  ^js [editor-options]
  (.-TabSize ^js editor-options))

(defn set-tab-size!
  ^js [editor-options value]
  (set! (.-TabSize ^js editor-options) value))

(defn new-line-character
  ^js [editor-options]
  (.-NewLineCharacter ^js editor-options))

(defn set-new-line-character!
  ^js [editor-options value]
  (set! (.-NewLineCharacter ^js editor-options) value))

(defn convert-tabs-to-spaces?
  ^js [editor-options]
  (.-ConvertTabsToSpaces ^js editor-options))

(defn set-convert-tabs-to-spaces!
  ^js [editor-options value]
  (set! (.-ConvertTabsToSpaces ^js editor-options) value))

(defn indent-style
  ^js [editor-options]
  (.-IndentStyle ^js editor-options))

(defn set-indent-style!
  ^js [editor-options value]
  (set! (.-IndentStyle ^js editor-options) value))
