(ns dots.typescript.printer-options)

(defn remove-comments?
  "**Returns:** `boolean | undefined`"
  ^js [printer-options]
  (.-removeComments ^js printer-options))

(defn set-remove-comments!
  ^js [printer-options value]
  (set! (.-removeComments ^js printer-options) value))

(defn new-line
  "**Returns:** `NewLineKind | undefined`"
  ^js [printer-options]
  (.-newLine ^js printer-options))

(defn set-new-line!
  ^js [printer-options value]
  (set! (.-newLine ^js printer-options) value))

(defn omit-trailing-semicolon?
  "**Returns:** `boolean | undefined`"
  ^js [printer-options]
  (.-omitTrailingSemicolon ^js printer-options))

(defn set-omit-trailing-semicolon!
  ^js [printer-options value]
  (set! (.-omitTrailingSemicolon ^js printer-options) value))

(defn no-emit-helpers?
  "**Returns:** `boolean | undefined`"
  ^js [printer-options]
  (.-noEmitHelpers ^js printer-options))

(defn set-no-emit-helpers!
  ^js [printer-options value]
  (set! (.-noEmitHelpers ^js printer-options) value))
