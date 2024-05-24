(ns dots.typescript.server.protocol.editor-settings)

(defn base-indent-size
  ^js [editor-settings]
  (.-baseIndentSize ^js editor-settings))

(defn set-base-indent-size!
  ^js [editor-settings value]
  (set! (.-baseIndentSize ^js editor-settings) value))

(defn indent-size
  ^js [editor-settings]
  (.-indentSize ^js editor-settings))

(defn set-indent-size!
  ^js [editor-settings value]
  (set! (.-indentSize ^js editor-settings) value))

(defn tab-size
  ^js [editor-settings]
  (.-tabSize ^js editor-settings))

(defn set-tab-size!
  ^js [editor-settings value]
  (set! (.-tabSize ^js editor-settings) value))

(defn new-line-character
  ^js [editor-settings]
  (.-newLineCharacter ^js editor-settings))

(defn set-new-line-character!
  ^js [editor-settings value]
  (set! (.-newLineCharacter ^js editor-settings) value))

(defn convert-tabs-to-spaces?
  ^js [editor-settings]
  (.-convertTabsToSpaces ^js editor-settings))

(defn set-convert-tabs-to-spaces!
  ^js [editor-settings value]
  (set! (.-convertTabsToSpaces ^js editor-settings) value))

(defn indent-style
  ^js [editor-settings]
  (.-indentStyle ^js editor-settings))

(defn set-indent-style!
  ^js [editor-settings value]
  (set! (.-indentStyle ^js editor-settings) value))

(defn trim-trailing-whitespace?
  ^js [editor-settings]
  (.-trimTrailingWhitespace ^js editor-settings))

(defn set-trim-trailing-whitespace!
  ^js [editor-settings value]
  (set! (.-trimTrailingWhitespace ^js editor-settings) value))
