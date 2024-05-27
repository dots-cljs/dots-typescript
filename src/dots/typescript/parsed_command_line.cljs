(ns dots.typescript.parsed-command-line
  "Either a parsed command line or a parsed tsconfig.json")

(defn options
  "**Returns:** `CompilerOptions`"
  ^js [parsed-command-line]
  (.-options ^js parsed-command-line))

(defn set-options!
  ^js [parsed-command-line value]
  (set! (.-options ^js parsed-command-line) value))

(defn type-acquisition
  "**Returns:** `TypeAcquisition | undefined`"
  ^js [parsed-command-line]
  (.-typeAcquisition ^js parsed-command-line))

(defn set-type-acquisition!
  ^js [parsed-command-line value]
  (set! (.-typeAcquisition ^js parsed-command-line) value))

(defn file-names
  "**Returns:** `string[]`"
  ^js [parsed-command-line]
  (.-fileNames ^js parsed-command-line))

(defn set-file-names!
  ^js [parsed-command-line value]
  (set! (.-fileNames ^js parsed-command-line) value))

(defn project-references
  "**Returns:** `readonly ProjectReference[] | undefined`"
  ^js [parsed-command-line]
  (.-projectReferences ^js parsed-command-line))

(defn set-project-references!
  ^js [parsed-command-line value]
  (set! (.-projectReferences ^js parsed-command-line) value))

(defn watch-options
  "**Returns:** `WatchOptions | undefined`"
  ^js [parsed-command-line]
  (.-watchOptions ^js parsed-command-line))

(defn set-watch-options!
  ^js [parsed-command-line value]
  (set! (.-watchOptions ^js parsed-command-line) value))

(defn raw
  "**Returns:** `any`"
  ^js [parsed-command-line]
  (.-raw ^js parsed-command-line))

(defn set-raw!
  ^js [parsed-command-line value]
  (set! (.-raw ^js parsed-command-line) value))

(defn errors
  "**Returns:** `Diagnostic[]`"
  ^js [parsed-command-line]
  (.-errors ^js parsed-command-line))

(defn set-errors!
  ^js [parsed-command-line value]
  (set! (.-errors ^js parsed-command-line) value))

(defn wildcard-directories
  "**Returns:** `MapLike<WatchDirectoryFlags> | undefined`"
  ^js [parsed-command-line]
  (.-wildcardDirectories ^js parsed-command-line))

(defn set-wildcard-directories!
  ^js [parsed-command-line value]
  (set! (.-wildcardDirectories ^js parsed-command-line) value))

(defn compile-on-save?
  "**Returns:** `boolean | undefined`"
  ^js [parsed-command-line]
  (.-compileOnSave ^js parsed-command-line))

(defn set-compile-on-save!
  ^js [parsed-command-line value]
  (set! (.-compileOnSave ^js parsed-command-line) value))
