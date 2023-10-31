(ns dots.typescript.template-literal-type-span
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [template-literal-type-span]
  (.-kind ^js template-literal-type-span))

(defn parent
  ^js [template-literal-type-span]
  (.-parent ^js template-literal-type-span))

(defn type
  ^js [template-literal-type-span]
  (.-type ^js template-literal-type-span))

(defn literal
  ^js [template-literal-type-span]
  (.-literal ^js template-literal-type-span))

(defn flags
  ^js [template-literal-type-span]
  (.-flags ^js template-literal-type-span))

(defn source-file
  ^js [template-literal-type-span]
  (.getSourceFile ^js template-literal-type-span))

(defn child-count
  (^js [template-literal-type-span]
   (.getChildCount ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getChildCount ^js template-literal-type-span source-file)))

(defn child-at
  (^js [template-literal-type-span index]
   (.getChildAt ^js template-literal-type-span index))
  (^js [template-literal-type-span index source-file]
   (.getChildAt ^js template-literal-type-span index source-file)))

(defn children
  (^js [template-literal-type-span]
   (.getChildren ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getChildren ^js template-literal-type-span source-file)))

(defn start
  (^js [template-literal-type-span]
   (.getStart ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getStart ^js template-literal-type-span source-file))
  (^js [template-literal-type-span source-file include-js-doc-comment?]
   (.getStart ^js template-literal-type-span source-file include-js-doc-comment?)))

(defn full-start
  ^js [template-literal-type-span]
  (.getFullStart ^js template-literal-type-span))

(defn get-end
  ^js [template-literal-type-span]
  (.getEnd ^js template-literal-type-span))

(defn width
  (^js [template-literal-type-span]
   (.getWidth ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getWidth ^js template-literal-type-span source-file)))

(defn full-width
  ^js [template-literal-type-span]
  (.getFullWidth ^js template-literal-type-span))

(defn leading-trivia-width
  (^js [template-literal-type-span]
   (.getLeadingTriviaWidth ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getLeadingTriviaWidth ^js template-literal-type-span source-file)))

(defn full-text
  (^js [template-literal-type-span]
   (.getFullText ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getFullText ^js template-literal-type-span source-file)))

(defn text
  (^js [template-literal-type-span]
   (.getText ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getText ^js template-literal-type-span source-file)))

(defn first-token
  (^js [template-literal-type-span]
   (.getFirstToken ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getFirstToken ^js template-literal-type-span source-file)))

(defn last-token
  (^js [template-literal-type-span]
   (.getLastToken ^js template-literal-type-span))
  (^js [template-literal-type-span source-file]
   (.getLastToken ^js template-literal-type-span source-file)))

(defn for-each-child
  (^js [template-literal-type-span cb-node]
   (.forEachChild ^js template-literal-type-span cb-node))
  (^js [template-literal-type-span cb-node cb-node-array]
   (.forEachChild ^js template-literal-type-span cb-node cb-node-array)))

(defn pos
  ^js [template-literal-type-span]
  (.-pos ^js template-literal-type-span))

(defn end
  ^js [template-literal-type-span]
  (.-end ^js template-literal-type-span))
