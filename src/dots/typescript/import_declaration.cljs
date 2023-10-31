(ns dots.typescript.import-declaration)

(defn kind
  ^js [import-declaration]
  (.-kind ^js import-declaration))

(defn parent
  ^js [import-declaration]
  (.-parent ^js import-declaration))

(defn modifiers
  ^js [import-declaration]
  (.-modifiers ^js import-declaration))

(defn import-clause
  ^js [import-declaration]
  (.-importClause ^js import-declaration))

(defn module-specifier
  "If this is not a StringLiteral it will be a grammar error."
  ^js [import-declaration]
  (.-moduleSpecifier ^js import-declaration))

(defn assert-clause
  ^js [import-declaration]
  (.-assertClause ^js import-declaration))

(defn flags
  ^js [import-declaration]
  (.-flags ^js import-declaration))

(defn source-file
  ^js [import-declaration]
  (.getSourceFile ^js import-declaration))

(defn child-count
  (^js [import-declaration]
   (.getChildCount ^js import-declaration))
  (^js [import-declaration source-file]
   (.getChildCount ^js import-declaration source-file)))

(defn child-at
  (^js [import-declaration index]
   (.getChildAt ^js import-declaration index))
  (^js [import-declaration index source-file]
   (.getChildAt ^js import-declaration index source-file)))

(defn children
  (^js [import-declaration]
   (.getChildren ^js import-declaration))
  (^js [import-declaration source-file]
   (.getChildren ^js import-declaration source-file)))

(defn start
  (^js [import-declaration]
   (.getStart ^js import-declaration))
  (^js [import-declaration source-file]
   (.getStart ^js import-declaration source-file))
  (^js [import-declaration source-file include-js-doc-comment?]
   (.getStart ^js import-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [import-declaration]
  (.getFullStart ^js import-declaration))

(defn get-end
  ^js [import-declaration]
  (.getEnd ^js import-declaration))

(defn width
  (^js [import-declaration]
   (.getWidth ^js import-declaration))
  (^js [import-declaration source-file]
   (.getWidth ^js import-declaration source-file)))

(defn full-width
  ^js [import-declaration]
  (.getFullWidth ^js import-declaration))

(defn leading-trivia-width
  (^js [import-declaration]
   (.getLeadingTriviaWidth ^js import-declaration))
  (^js [import-declaration source-file]
   (.getLeadingTriviaWidth ^js import-declaration source-file)))

(defn full-text
  (^js [import-declaration]
   (.getFullText ^js import-declaration))
  (^js [import-declaration source-file]
   (.getFullText ^js import-declaration source-file)))

(defn text
  (^js [import-declaration]
   (.getText ^js import-declaration))
  (^js [import-declaration source-file]
   (.getText ^js import-declaration source-file)))

(defn first-token
  (^js [import-declaration]
   (.getFirstToken ^js import-declaration))
  (^js [import-declaration source-file]
   (.getFirstToken ^js import-declaration source-file)))

(defn last-token
  (^js [import-declaration]
   (.getLastToken ^js import-declaration))
  (^js [import-declaration source-file]
   (.getLastToken ^js import-declaration source-file)))

(defn for-each-child
  (^js [import-declaration cb-node]
   (.forEachChild ^js import-declaration cb-node))
  (^js [import-declaration cb-node cb-node-array]
   (.forEachChild ^js import-declaration cb-node cb-node-array)))

(defn pos
  ^js [import-declaration]
  (.-pos ^js import-declaration))

(defn end
  ^js [import-declaration]
  (.-end ^js import-declaration))
