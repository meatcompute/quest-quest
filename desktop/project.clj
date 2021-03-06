(defproject quest-quest "0.1.3"
  :description "Quest Quest, the easist RPG ever made."

  :dependencies [[com.badlogicgames.gdx/gdx "1.3.1"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.3.1"]
                 [com.badlogicgames.gdx/gdx-box2d "1.3.1"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.3.1"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.3.1"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.3.1"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.3.1"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.trace "0.7.5"]
                 [org.clojure/java.data "0.1.1"]
                 [play-clj "0.3.11"]]

  :source-paths ["src" "src-common"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [quest-quest.core.desktop-launcher]
  :main quest-quest.core.desktop-launcher)
