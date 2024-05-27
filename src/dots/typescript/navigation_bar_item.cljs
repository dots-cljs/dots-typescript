(ns dots.typescript.navigation-bar-item
  "Navigation bar interface designed for visual studio's dual-column layout.
   This does not form a proper tree.
   The navbar is returned as a list of top-level items, each of which has a list of child items.
   Child items always have an empty array for their `childItems`.")

(defn text
  "**Returns:** `string`"
  ^js [navigation-bar-item]
  (.-text ^js navigation-bar-item))

(defn set-text!
  ^js [navigation-bar-item value]
  (set! (.-text ^js navigation-bar-item) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [navigation-bar-item]
  (.-kind ^js navigation-bar-item))

(defn set-kind!
  ^js [navigation-bar-item value]
  (set! (.-kind ^js navigation-bar-item) value))

(defn kind-modifiers
  "**Returns:** `string`"
  ^js [navigation-bar-item]
  (.-kindModifiers ^js navigation-bar-item))

(defn set-kind-modifiers!
  ^js [navigation-bar-item value]
  (set! (.-kindModifiers ^js navigation-bar-item) value))

(defn spans
  "**Returns:** `TextSpan[]`"
  ^js [navigation-bar-item]
  (.-spans ^js navigation-bar-item))

(defn set-spans!
  ^js [navigation-bar-item value]
  (set! (.-spans ^js navigation-bar-item) value))

(defn child-items
  "**Returns:** `NavigationBarItem[]`"
  ^js [navigation-bar-item]
  (.-childItems ^js navigation-bar-item))

(defn set-child-items!
  ^js [navigation-bar-item value]
  (set! (.-childItems ^js navigation-bar-item) value))

(defn indent
  "**Returns:** `number`"
  ^js [navigation-bar-item]
  (.-indent ^js navigation-bar-item))

(defn set-indent!
  ^js [navigation-bar-item value]
  (set! (.-indent ^js navigation-bar-item) value))

(defn bolded?
  "**Returns:** `boolean`"
  ^js [navigation-bar-item]
  (.-bolded ^js navigation-bar-item))

(defn set-bolded!
  ^js [navigation-bar-item value]
  (set! (.-bolded ^js navigation-bar-item) value))

(defn grayed?
  "**Returns:** `boolean`"
  ^js [navigation-bar-item]
  (.-grayed ^js navigation-bar-item))

(defn set-grayed!
  ^js [navigation-bar-item value]
  (set! (.-grayed ^js navigation-bar-item) value))
