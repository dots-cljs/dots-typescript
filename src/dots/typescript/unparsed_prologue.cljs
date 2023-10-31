(ns dots.typescript.unparsed-prologue)

(defn kind
  ^js [unparsed-prologue]
  (.-kind ^js unparsed-prologue))

(defn parent
  ^js [unparsed-prologue]
  (.-parent ^js unparsed-prologue))

(defn data
  ^js [unparsed-prologue]
  (.-data ^js unparsed-prologue))

(defn flags
  ^js [unparsed-prologue]
  (.-flags ^js unparsed-prologue))

(defn source-file
  ^js [unparsed-prologue]
  (.getSourceFile ^js unparsed-prologue))

(defn child-count
  (^js [unparsed-prologue]
   (.getChildCount ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getChildCount ^js unparsed-prologue source-file)))

(defn child-at
  (^js [unparsed-prologue index]
   (.getChildAt ^js unparsed-prologue index))
  (^js [unparsed-prologue index source-file]
   (.getChildAt ^js unparsed-prologue index source-file)))

(defn children
  (^js [unparsed-prologue]
   (.getChildren ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getChildren ^js unparsed-prologue source-file)))

(defn start
  (^js [unparsed-prologue]
   (.getStart ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getStart ^js unparsed-prologue source-file))
  (^js [unparsed-prologue source-file include-js-doc-comment?]
   (.getStart ^js unparsed-prologue source-file include-js-doc-comment?)))

(defn full-start
  ^js [unparsed-prologue]
  (.getFullStart ^js unparsed-prologue))

(defn get-end
  ^js [unparsed-prologue]
  (.getEnd ^js unparsed-prologue))

(defn width
  (^js [unparsed-prologue]
   (.getWidth ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getWidth ^js unparsed-prologue source-file)))

(defn full-width
  ^js [unparsed-prologue]
  (.getFullWidth ^js unparsed-prologue))

(defn leading-trivia-width
  (^js [unparsed-prologue]
   (.getLeadingTriviaWidth ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getLeadingTriviaWidth ^js unparsed-prologue source-file)))

(defn full-text
  (^js [unparsed-prologue]
   (.getFullText ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getFullText ^js unparsed-prologue source-file)))

(defn text
  (^js [unparsed-prologue]
   (.getText ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getText ^js unparsed-prologue source-file)))

(defn first-token
  (^js [unparsed-prologue]
   (.getFirstToken ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getFirstToken ^js unparsed-prologue source-file)))

(defn last-token
  (^js [unparsed-prologue]
   (.getLastToken ^js unparsed-prologue))
  (^js [unparsed-prologue source-file]
   (.getLastToken ^js unparsed-prologue source-file)))

(defn for-each-child
  (^js [unparsed-prologue cb-node]
   (.forEachChild ^js unparsed-prologue cb-node))
  (^js [unparsed-prologue cb-node cb-node-array]
   (.forEachChild ^js unparsed-prologue cb-node cb-node-array)))

(defn pos
  ^js [unparsed-prologue]
  (.-pos ^js unparsed-prologue))

(defn end
  ^js [unparsed-prologue]
  (.-end ^js unparsed-prologue))
