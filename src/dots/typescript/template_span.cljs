(ns dots.typescript.template-span)

(defn kind
  ^js [template-span]
  (.-kind ^js template-span))

(defn parent
  ^js [template-span]
  (.-parent ^js template-span))

(defn expression
  ^js [template-span]
  (.-expression ^js template-span))

(defn literal
  ^js [template-span]
  (.-literal ^js template-span))

(defn flags
  ^js [template-span]
  (.-flags ^js template-span))

(defn source-file
  ^js [template-span]
  (.getSourceFile ^js template-span))

(defn child-count
  (^js [template-span]
   (.getChildCount ^js template-span))
  (^js [template-span source-file]
   (.getChildCount ^js template-span source-file)))

(defn child-at
  (^js [template-span index]
   (.getChildAt ^js template-span index))
  (^js [template-span index source-file]
   (.getChildAt ^js template-span index source-file)))

(defn children
  (^js [template-span]
   (.getChildren ^js template-span))
  (^js [template-span source-file]
   (.getChildren ^js template-span source-file)))

(defn start
  (^js [template-span]
   (.getStart ^js template-span))
  (^js [template-span source-file]
   (.getStart ^js template-span source-file))
  (^js [template-span source-file include-js-doc-comment?]
   (.getStart ^js template-span source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-span]
  (.getFullStart ^js template-span))

(defn get-end
  ^js [template-span]
  (.getEnd ^js template-span))

(defn width
  (^js [template-span]
   (.getWidth ^js template-span))
  (^js [template-span source-file]
   (.getWidth ^js template-span source-file)))

(defn full-width
  ^js [template-span]
  (.getFullWidth ^js template-span))

(defn leading-trivia-width
  (^js [template-span]
   (.getLeadingTriviaWidth ^js template-span))
  (^js [template-span source-file]
   (.getLeadingTriviaWidth ^js template-span source-file)))

(defn full-text
  (^js [template-span]
   (.getFullText ^js template-span))
  (^js [template-span source-file]
   (.getFullText ^js template-span source-file)))

(defn text
  (^js [template-span]
   (.getText ^js template-span))
  (^js [template-span source-file]
   (.getText ^js template-span source-file)))

(defn first-token
  (^js [template-span]
   (.getFirstToken ^js template-span))
  (^js [template-span source-file]
   (.getFirstToken ^js template-span source-file)))

(defn last-token
  (^js [template-span]
   (.getLastToken ^js template-span))
  (^js [template-span source-file]
   (.getLastToken ^js template-span source-file)))

(defn for-each-child
  (^js [template-span cb-node]
   (.forEachChild ^js template-span cb-node))
  (^js [template-span cb-node cb-node-array]
   (.forEachChild ^js template-span cb-node cb-node-array)))

(defn pos
  ^js [template-span]
  (.-pos ^js template-span))

(defn end
  ^js [template-span]
  (.-end ^js template-span))
