(ns dots.typescript.export-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [export-declaration]
  (.-kind ^js export-declaration))

(defn parent
  ^js [export-declaration]
  (.-parent ^js export-declaration))

(defn modifiers
  ^js [export-declaration]
  (.-modifiers ^js export-declaration))

(defn type-only?
  ^js [export-declaration]
  (.-isTypeOnly ^js export-declaration))

(defn export-clause
  "Will not be assigned in the case of `export * from \"foo\";`"
  ^js [export-declaration]
  (.-exportClause ^js export-declaration))

(defn module-specifier
  "If this is not a StringLiteral it will be a grammar error."
  ^js [export-declaration]
  (.-moduleSpecifier ^js export-declaration))

(defn assert-clause
  ^js [export-declaration]
  (.-assertClause ^js export-declaration))

(defn name
  ^js [export-declaration]
  (.-name ^js export-declaration))

(defn flags
  ^js [export-declaration]
  (.-flags ^js export-declaration))

(defn source-file
  ^js [export-declaration]
  (.getSourceFile ^js export-declaration))

(defn child-count
  (^js [export-declaration]
   (.getChildCount ^js export-declaration))
  (^js [export-declaration source-file]
   (.getChildCount ^js export-declaration source-file)))

(defn child-at
  (^js [export-declaration index]
   (.getChildAt ^js export-declaration index))
  (^js [export-declaration index source-file]
   (.getChildAt ^js export-declaration index source-file)))

(defn children
  (^js [export-declaration]
   (.getChildren ^js export-declaration))
  (^js [export-declaration source-file]
   (.getChildren ^js export-declaration source-file)))

(defn start
  (^js [export-declaration]
   (.getStart ^js export-declaration))
  (^js [export-declaration source-file]
   (.getStart ^js export-declaration source-file))
  (^js [export-declaration source-file include-js-doc-comment?]
   (.getStart ^js export-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [export-declaration]
  (.getFullStart ^js export-declaration))

(defn get-end
  ^js [export-declaration]
  (.getEnd ^js export-declaration))

(defn width
  (^js [export-declaration]
   (.getWidth ^js export-declaration))
  (^js [export-declaration source-file]
   (.getWidth ^js export-declaration source-file)))

(defn full-width
  ^js [export-declaration]
  (.getFullWidth ^js export-declaration))

(defn leading-trivia-width
  (^js [export-declaration]
   (.getLeadingTriviaWidth ^js export-declaration))
  (^js [export-declaration source-file]
   (.getLeadingTriviaWidth ^js export-declaration source-file)))

(defn full-text
  (^js [export-declaration]
   (.getFullText ^js export-declaration))
  (^js [export-declaration source-file]
   (.getFullText ^js export-declaration source-file)))

(defn text
  (^js [export-declaration]
   (.getText ^js export-declaration))
  (^js [export-declaration source-file]
   (.getText ^js export-declaration source-file)))

(defn first-token
  (^js [export-declaration]
   (.getFirstToken ^js export-declaration))
  (^js [export-declaration source-file]
   (.getFirstToken ^js export-declaration source-file)))

(defn last-token
  (^js [export-declaration]
   (.getLastToken ^js export-declaration))
  (^js [export-declaration source-file]
   (.getLastToken ^js export-declaration source-file)))

(defn for-each-child
  (^js [export-declaration cb-node]
   (.forEachChild ^js export-declaration cb-node))
  (^js [export-declaration cb-node cb-node-array]
   (.forEachChild ^js export-declaration cb-node cb-node-array)))

(defn pos
  ^js [export-declaration]
  (.-pos ^js export-declaration))

(defn end
  ^js [export-declaration]
  (.-end ^js export-declaration))
