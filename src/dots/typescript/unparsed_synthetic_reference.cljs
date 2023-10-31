(ns dots.typescript.unparsed-synthetic-reference)

(defn kind
  ^js [unparsed-synthetic-reference]
  (.-kind ^js unparsed-synthetic-reference))

(defn parent
  ^js [unparsed-synthetic-reference]
  (.-parent ^js unparsed-synthetic-reference))

(defn data
  ^js [unparsed-synthetic-reference]
  (.-data ^js unparsed-synthetic-reference))

(defn flags
  ^js [unparsed-synthetic-reference]
  (.-flags ^js unparsed-synthetic-reference))

(defn source-file
  ^js [unparsed-synthetic-reference]
  (.getSourceFile ^js unparsed-synthetic-reference))

(defn child-count
  (^js [unparsed-synthetic-reference]
   (.getChildCount ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getChildCount ^js unparsed-synthetic-reference source-file)))

(defn child-at
  (^js [unparsed-synthetic-reference index]
   (.getChildAt ^js unparsed-synthetic-reference index))
  (^js [unparsed-synthetic-reference index source-file]
   (.getChildAt ^js unparsed-synthetic-reference index source-file)))

(defn children
  (^js [unparsed-synthetic-reference]
   (.getChildren ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getChildren ^js unparsed-synthetic-reference source-file)))

(defn start
  (^js [unparsed-synthetic-reference]
   (.getStart ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getStart ^js unparsed-synthetic-reference source-file))
  (^js [unparsed-synthetic-reference source-file include-js-doc-comment?]
   (.getStart ^js unparsed-synthetic-reference source-file include-js-doc-comment?)))

(defn full-start
  ^js [unparsed-synthetic-reference]
  (.getFullStart ^js unparsed-synthetic-reference))

(defn get-end
  ^js [unparsed-synthetic-reference]
  (.getEnd ^js unparsed-synthetic-reference))

(defn width
  (^js [unparsed-synthetic-reference]
   (.getWidth ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getWidth ^js unparsed-synthetic-reference source-file)))

(defn full-width
  ^js [unparsed-synthetic-reference]
  (.getFullWidth ^js unparsed-synthetic-reference))

(defn leading-trivia-width
  (^js [unparsed-synthetic-reference]
   (.getLeadingTriviaWidth ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getLeadingTriviaWidth ^js unparsed-synthetic-reference source-file)))

(defn full-text
  (^js [unparsed-synthetic-reference]
   (.getFullText ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getFullText ^js unparsed-synthetic-reference source-file)))

(defn text
  (^js [unparsed-synthetic-reference]
   (.getText ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getText ^js unparsed-synthetic-reference source-file)))

(defn first-token
  (^js [unparsed-synthetic-reference]
   (.getFirstToken ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getFirstToken ^js unparsed-synthetic-reference source-file)))

(defn last-token
  (^js [unparsed-synthetic-reference]
   (.getLastToken ^js unparsed-synthetic-reference))
  (^js [unparsed-synthetic-reference source-file]
   (.getLastToken ^js unparsed-synthetic-reference source-file)))

(defn for-each-child
  (^js [unparsed-synthetic-reference cb-node]
   (.forEachChild ^js unparsed-synthetic-reference cb-node))
  (^js [unparsed-synthetic-reference cb-node cb-node-array]
   (.forEachChild ^js unparsed-synthetic-reference cb-node cb-node-array)))

(defn decorators
  ^js [unparsed-synthetic-reference]
  (.-decorators ^js unparsed-synthetic-reference))

(defn modifiers
  ^js [unparsed-synthetic-reference]
  (.-modifiers ^js unparsed-synthetic-reference))

(defn pos
  ^js [unparsed-synthetic-reference]
  (.-pos ^js unparsed-synthetic-reference))

(defn end
  ^js [unparsed-synthetic-reference]
  (.-end ^js unparsed-synthetic-reference))
