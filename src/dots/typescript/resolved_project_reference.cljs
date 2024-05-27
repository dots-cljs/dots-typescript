(ns dots.typescript.resolved-project-reference)

(defn command-line
  "**Returns:** `ParsedCommandLine`"
  ^js [resolved-project-reference]
  (.-commandLine ^js resolved-project-reference))

(defn set-command-line!
  ^js [resolved-project-reference value]
  (set! (.-commandLine ^js resolved-project-reference) value))

(defn source-file
  "**Returns:** `SourceFile`"
  ^js [resolved-project-reference]
  (.-sourceFile ^js resolved-project-reference))

(defn set-source-file!
  ^js [resolved-project-reference value]
  (set! (.-sourceFile ^js resolved-project-reference) value))

(defn references
  "**Returns:** `readonly (ResolvedProjectReference | undefined)[] | undefined`"
  ^js [resolved-project-reference]
  (.-references ^js resolved-project-reference))

(defn set-references!
  ^js [resolved-project-reference value]
  (set! (.-references ^js resolved-project-reference) value))
