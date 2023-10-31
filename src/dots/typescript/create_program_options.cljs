(ns dots.typescript.create-program-options)

(defn root-names
  ^js [create-program-options]
  (.-rootNames ^js create-program-options))

(defn set-root-names!
  ^js [create-program-options value]
  (set! (.-rootNames ^js create-program-options) value))

(defn options
  ^js [create-program-options]
  (.-options ^js create-program-options))

(defn set-options!
  ^js [create-program-options value]
  (set! (.-options ^js create-program-options) value))

(defn project-references
  ^js [create-program-options]
  (.-projectReferences ^js create-program-options))

(defn set-project-references!
  ^js [create-program-options value]
  (set! (.-projectReferences ^js create-program-options) value))

(defn host
  ^js [create-program-options]
  (.-host ^js create-program-options))

(defn set-host!
  ^js [create-program-options value]
  (set! (.-host ^js create-program-options) value))

(defn old-program
  ^js [create-program-options]
  (.-oldProgram ^js create-program-options))

(defn set-old-program!
  ^js [create-program-options value]
  (set! (.-oldProgram ^js create-program-options) value))

(defn config-file-parsing-diagnostics
  ^js [create-program-options]
  (.-configFileParsingDiagnostics ^js create-program-options))

(defn set-config-file-parsing-diagnostics!
  ^js [create-program-options value]
  (set! (.-configFileParsingDiagnostics ^js create-program-options) value))
