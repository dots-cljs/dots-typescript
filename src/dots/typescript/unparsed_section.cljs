(ns dots.typescript.unparsed-section)

(defn kind
  ^js [unparsed-section]
  (.-kind ^js unparsed-section))

(defn parent
  ^js [unparsed-section]
  (.-parent ^js unparsed-section))

(defn data
  ^js [unparsed-section]
  (.-data ^js unparsed-section))

(defn flags
  ^js [unparsed-section]
  (.-flags ^js unparsed-section))

(defn source-file
  ^js [unparsed-section]
  (.getSourceFile ^js unparsed-section))

(defn child-count
  (^js [unparsed-section]
   (.getChildCount ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getChildCount ^js unparsed-section source-file)))

(defn child-at
  (^js [unparsed-section index]
   (.getChildAt ^js unparsed-section index))
  (^js [unparsed-section index source-file]
   (.getChildAt ^js unparsed-section index source-file)))

(defn children
  (^js [unparsed-section]
   (.getChildren ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getChildren ^js unparsed-section source-file)))

(defn start
  (^js [unparsed-section]
   (.getStart ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getStart ^js unparsed-section source-file))
  (^js [unparsed-section source-file include-js-doc-comment?]
   (.getStart ^js unparsed-section source-file include-js-doc-comment?)))

(defn full-start
  ^js [unparsed-section]
  (.getFullStart ^js unparsed-section))

(defn get-end
  ^js [unparsed-section]
  (.getEnd ^js unparsed-section))

(defn width
  (^js [unparsed-section]
   (.getWidth ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getWidth ^js unparsed-section source-file)))

(defn full-width
  ^js [unparsed-section]
  (.getFullWidth ^js unparsed-section))

(defn leading-trivia-width
  (^js [unparsed-section]
   (.getLeadingTriviaWidth ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getLeadingTriviaWidth ^js unparsed-section source-file)))

(defn full-text
  (^js [unparsed-section]
   (.getFullText ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getFullText ^js unparsed-section source-file)))

(defn text
  (^js [unparsed-section]
   (.getText ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getText ^js unparsed-section source-file)))

(defn first-token
  (^js [unparsed-section]
   (.getFirstToken ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getFirstToken ^js unparsed-section source-file)))

(defn last-token
  (^js [unparsed-section]
   (.getLastToken ^js unparsed-section))
  (^js [unparsed-section source-file]
   (.getLastToken ^js unparsed-section source-file)))

(defn for-each-child
  (^js [unparsed-section cb-node]
   (.forEachChild ^js unparsed-section cb-node))
  (^js [unparsed-section cb-node cb-node-array]
   (.forEachChild ^js unparsed-section cb-node cb-node-array)))

(defn pos
  ^js [unparsed-section]
  (.-pos ^js unparsed-section))

(defn end
  ^js [unparsed-section]
  (.-end ^js unparsed-section))
