(ns dots.typescript.export-assignment
  "This is either an `export =` or an `export default` declaration.
   Unless `isExportEquals` is set, this node was parsed as an `export default`."
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [export-assignment]
  (.-kind ^js export-assignment))

(defn parent
  ^js [export-assignment]
  (.-parent ^js export-assignment))

(defn modifiers
  ^js [export-assignment]
  (.-modifiers ^js export-assignment))

(defn export-equals?
  ^js [export-assignment]
  (.-isExportEquals ^js export-assignment))

(defn expression
  ^js [export-assignment]
  (.-expression ^js export-assignment))

(defn name
  ^js [export-assignment]
  (.-name ^js export-assignment))

(defn flags
  ^js [export-assignment]
  (.-flags ^js export-assignment))

(defn source-file
  ^js [export-assignment]
  (.getSourceFile ^js export-assignment))

(defn child-count
  (^js [export-assignment]
   (.getChildCount ^js export-assignment))
  (^js [export-assignment source-file]
   (.getChildCount ^js export-assignment source-file)))

(defn child-at
  (^js [export-assignment index]
   (.getChildAt ^js export-assignment index))
  (^js [export-assignment index source-file]
   (.getChildAt ^js export-assignment index source-file)))

(defn children
  (^js [export-assignment]
   (.getChildren ^js export-assignment))
  (^js [export-assignment source-file]
   (.getChildren ^js export-assignment source-file)))

(defn start
  (^js [export-assignment]
   (.getStart ^js export-assignment))
  (^js [export-assignment source-file]
   (.getStart ^js export-assignment source-file))
  (^js [export-assignment source-file include-js-doc-comment?]
   (.getStart ^js export-assignment source-file include-js-doc-comment?)))

(defn full-start
  ^js [export-assignment]
  (.getFullStart ^js export-assignment))

(defn get-end
  ^js [export-assignment]
  (.getEnd ^js export-assignment))

(defn width
  (^js [export-assignment]
   (.getWidth ^js export-assignment))
  (^js [export-assignment source-file]
   (.getWidth ^js export-assignment source-file)))

(defn full-width
  ^js [export-assignment]
  (.getFullWidth ^js export-assignment))

(defn leading-trivia-width
  (^js [export-assignment]
   (.getLeadingTriviaWidth ^js export-assignment))
  (^js [export-assignment source-file]
   (.getLeadingTriviaWidth ^js export-assignment source-file)))

(defn full-text
  (^js [export-assignment]
   (.getFullText ^js export-assignment))
  (^js [export-assignment source-file]
   (.getFullText ^js export-assignment source-file)))

(defn text
  (^js [export-assignment]
   (.getText ^js export-assignment))
  (^js [export-assignment source-file]
   (.getText ^js export-assignment source-file)))

(defn first-token
  (^js [export-assignment]
   (.getFirstToken ^js export-assignment))
  (^js [export-assignment source-file]
   (.getFirstToken ^js export-assignment source-file)))

(defn last-token
  (^js [export-assignment]
   (.getLastToken ^js export-assignment))
  (^js [export-assignment source-file]
   (.getLastToken ^js export-assignment source-file)))

(defn for-each-child
  (^js [export-assignment cb-node]
   (.forEachChild ^js export-assignment cb-node))
  (^js [export-assignment cb-node cb-node-array]
   (.forEachChild ^js export-assignment cb-node cb-node-array)))

(defn decorators
  ^js [export-assignment]
  (.-decorators ^js export-assignment))

(defn pos
  ^js [export-assignment]
  (.-pos ^js export-assignment))

(defn end
  ^js [export-assignment]
  (.-end ^js export-assignment))
