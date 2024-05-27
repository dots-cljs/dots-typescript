(ns dots.typescript.incremental-program-options)

(defn root-names
  "**Returns:** `readonly string[]`"
  ^js [incremental-program-options]
  (.-rootNames ^js incremental-program-options))

(defn set-root-names!
  ^js [incremental-program-options value]
  (set! (.-rootNames ^js incremental-program-options) value))

(defn options
  "**Returns:** `CompilerOptions`"
  ^js [incremental-program-options]
  (.-options ^js incremental-program-options))

(defn set-options!
  ^js [incremental-program-options value]
  (set! (.-options ^js incremental-program-options) value))

(defn config-file-parsing-diagnostics
  "**Returns:** `readonly Diagnostic[] | undefined`"
  ^js [incremental-program-options]
  (.-configFileParsingDiagnostics ^js incremental-program-options))

(defn set-config-file-parsing-diagnostics!
  ^js [incremental-program-options value]
  (set! (.-configFileParsingDiagnostics ^js incremental-program-options) value))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [incremental-program-options]
  (.-projectReferences ^js incremental-program-options))

(defn set-project-references!
  ^js [incremental-program-options value]
  (set! (.-projectReferences ^js incremental-program-options) value))

(defn host
  "**Returns:** `CompilerHost | undefined`"
  ^js [incremental-program-options]
  (.-host ^js incremental-program-options))

(defn set-host!
  ^js [incremental-program-options value]
  (set! (.-host ^js incremental-program-options) value))

(defn create-program
  "**Returns:** `CreateProgram<T> | undefined`"
  ^js [incremental-program-options]
  (.-createProgram ^js incremental-program-options))

(defn set-create-program!
  ^js [incremental-program-options value]
  (set! (.-createProgram ^js incremental-program-options) value))
